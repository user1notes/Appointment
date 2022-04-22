package com.example.demo;

public class Address {
	private String locality;
	private String city;
	private String state;
	private int pinCode;
	private String country;
	
	public Address(String locality, String city, String state, String country, int pinCode) {
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
	}
	
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
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
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return locality + ", " + city + ", " + state + ",  " + pinCode + ", " + country;
	}
	
	
}
