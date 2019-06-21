package com.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // tells Hibernate to make a table out of this class
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String password;
	
	public User() {
	
	}

	public User(Integer id,String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return name;
	}
	public void setUserName(String name) {
		this.name = name;
	}
	public String getUserPassword() {
		return password;
	}
	public void setUserPassword(String password) {
		this.password= password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}



	
	
	

}
