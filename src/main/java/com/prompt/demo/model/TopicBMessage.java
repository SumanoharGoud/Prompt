package com.prompt.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TopicBMessage {
    private Key key;
    private Value value;
    private Audit audit;

    

    public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public Audit getAudit() {
		return audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public static class Key {
        @JsonProperty("catalog_number")
        private String catalogNumber;
        private String country;
		public String getCatalogNumber() {
			return catalogNumber;
		}
		public void setCatalogNumber(String catalogNumber) {
			this.catalogNumber = catalogNumber;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}

       
    }

    public static class Value {
        @JsonProperty("catalog_number")
        private String catalogNumber;
        @JsonProperty("order_number")
        private String orderNumber;
        private String quantity;
        @JsonProperty("sales_date")
        private String salesDate;
        private String country;
		public String getCatalogNumber() {
			return catalogNumber;
		}
		public void setCatalogNumber(String catalogNumber) {
			this.catalogNumber = catalogNumber;
		}
		public String getOrderNumber() {
			return orderNumber;
		}
		public void setOrderNumber(String orderNumber) {
			this.orderNumber = orderNumber;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getSalesDate() {
			return salesDate;
		}
		public void setSalesDate(String salesDate) {
			this.salesDate = salesDate;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}

        
    }

    public static class Audit {
        @JsonProperty("event_name")
        private String eventName;
        @JsonProperty("source_system")
        private String sourceSystem;
		public String getEventName() {
			return eventName;
		}
		public void setEventName(String eventName) {
			this.eventName = eventName;
		}
		public String getSourceSystem() {
			return sourceSystem;
		}
		public void setSourceSystem(String sourceSystem) {
			this.sourceSystem = sourceSystem;
		}

       
    }
}

