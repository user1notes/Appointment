package com.example.demo;

public class Customer {
	private String name;
	private int age;
	private String mobileNumber;
	private String email;
	Address address;
	Package packageTaken;
	
	
	public Package getPackageTaken() {
		return packageTaken;
	}
	public void setPackageTaken(Package packageTaken) {
		this.packageTaken = packageTaken;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + ", " + age + ", " + mobileNumber + ", " + email + ", " + address + "\nPakage details: " + packageTaken;
	}
}
