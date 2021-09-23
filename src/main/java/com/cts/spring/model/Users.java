package com.cts.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Users {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	@JoinColumn(name="ad_fk",referencedColumnName="uId")
	private Address address;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Users(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Users() {
		
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + "]";
	}

}