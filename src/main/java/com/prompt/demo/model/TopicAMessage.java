package com.prompt.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TopicAMessage {
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
        @JsonProperty("is_selling")
        private boolean isSelling;
        private String model;
        @JsonProperty("product_id")
        private String productId;
        @JsonProperty("registration_id")
        private String registrationId;
        @JsonProperty("registration_number")
        private String registrationNumber;
        @JsonProperty("selling_status_date")
        private String sellingStatusDate;
        private String country;
		public String getCatalogNumber() {
			return catalogNumber;
		}
		public void setCatalogNumber(String catalogNumber) {
			this.catalogNumber = catalogNumber;
		}
		public boolean isSelling() {
			return isSelling;
		}
		public void setSelling(boolean isSelling) {
			this.isSelling = isSelling;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
			this.productId = productId;
		}
		public String getRegistrationId() {
			return registrationId;
		}
		public void setRegistrationId(String registrationId) {
			this.registrationId = registrationId;
		}
		public String getRegistrationNumber() {
			return registrationNumber;
		}
		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}
		public String getSellingStatusDate() {
			return sellingStatusDate;
		}
		public void setSellingStatusDate(String sellingStatusDate) {
			this.sellingStatusDate = sellingStatusDate;
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
