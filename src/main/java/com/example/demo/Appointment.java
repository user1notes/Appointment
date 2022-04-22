package com.example.demo;

enum Preference{
	MALE, FEMALE
}

public class Appointment {
	
	Customer customer;
	Preference preference;
	boolean physiotherapist;
	int weeks;
	int amount;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Preference getPreference() {
		return preference;
	}
	public void setPreference(Preference preference) {
		this.preference = preference;
	}
	public boolean isPhysiotherapist() {
		return physiotherapist;
	}
	public void setPhysiotherapist(boolean physiotherapist) {
		this.physiotherapist = physiotherapist;
	}
	public int getWeeks() {
		return weeks;
	}
	public void setWeeks(int weeks) {
		this.weeks = weeks;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}	
	
}
