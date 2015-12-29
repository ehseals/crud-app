package com.aquent.crudapp.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Client {
	
	 private Integer clientId;
	 
	 
	 @NotNull
	 @Size(min = 1, max = 50, message = "Name is required. Max lenght is 50")
	 private String name;
	 
	 @NotNull
	 @Size(min = 5, max = 50, message = "Street Address is required. Max lenght is 50")
	 private String streetAddress;
	 
	 @NotNull
	 @Size(min = 2, max = 50, message = "City is required. Max lenght is 50")
	 private String city;
	 
	 @NotNull
	 @Size(min = 2, max = 2, message = "State is required. Max lenght is 2")
	 private String state;
	 
	 @NotNull
	 @Size(min = 5, max = 5, message = "Zip code is required. Max lenght is 5, Min length is 5")
	 private String zipCode;
	 
	 @NotNull
	 @Size(min = 4, max = 30, message = "Phone number is required. Max lenght is 30")
	 private String phoneNumber;
	 
	 @NotNull
	 @Size(min = 1, max = 75, message = "URI is required. Max lenght is 75")
	 private String uri;
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	

}
