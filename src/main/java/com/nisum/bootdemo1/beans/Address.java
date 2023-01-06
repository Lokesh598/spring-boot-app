package com.nisum.bootdemo1.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String hno = "65-2";
	private String streetName = "shrikrishna";
	private String city = "jaipur";
	private String state = "rajasthan";
	
	public Address () {}
	public Address(String hno, String streetName, String city, String state) {
		this.hno = hno;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
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
	
	
}
