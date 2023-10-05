package com.prompt.demo.service;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prompt.demo.model.TopicAMessage;

@Service
public class KafkaConsumerService {
    private final ObjectMapper objectMapper;
    
    @Autowired
    KafkaProducerService kafkaProducerService;
    @Autowired
    public KafkaConsumerService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @KafkaListener(topics = "TOPIC_A", groupId = "group_id")
    public void consumeTopicA(String message) {
        try {
            TopicAMessage topicAMessage = objectMapper.readValue(message, TopicAMessage.class);

            if ("001".equals(topicAMessage.getKey().getCountry()) &&
                topicAMessage.getKey().getCatalogNumber().length() == 5 &&
                isValidDateFormat(topicAMessage.getValue().getSellingStatusDate())) {
                
                produceToTopicC(topicAMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @KafkaListener(topics = "TOPIC_B", groupId = "group_id")
    public void consumeTopicB(String message) {
    	try {
            TopicAMessage topicAMessage = objectMapper.readValue(message, TopicAMessage.class);

            if ("001".equals(topicAMessage.getKey().getCountry()) &&
                topicAMessage.getKey().getCatalogNumber().length() == 5 &&
                isValidDateFormat(topicAMessage.getValue().getSellingStatusDate())) {
                
                produceToTopicC(topicAMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isValidDateFormat(String dateString) {
    	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            dateFormatter.parse(dateString);
            return true; 
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private void produceToTopicC(TopicAMessage topicAMessage) {
    	String jsonString;
		try {
			jsonString = objectMapper.writeValueAsString(topicAMessage);
			kafkaProducerService.produceToTopicC(jsonString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	
    }
}


