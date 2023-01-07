package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sir {
	@Id
	private long id;
	private String firstname;
	private String lastname;
	public Sir(long id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	
	public Sir() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setDescription(String lastname) {
		this.lastname = lastname;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
