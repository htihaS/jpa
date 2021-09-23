package com.cts.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private int uId;
	private String street;
	private String city;
	private String state;
	
	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public Address(int uId, String street, String city, String state) {
		super();
		this.uId = uId;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [uId=" + uId + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
}
