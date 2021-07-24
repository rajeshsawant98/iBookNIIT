package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	@Column
	@Size(min = 4, max = 16, message = "username should be of minimum 4 characters and maximum of 16 characters")
	@NotEmpty(message="Username must not be empty")
	private String username;
	
	@NotEmpty(message = "Email is required")
	private String email;
	
	@Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&_]).{6,10}", message = "password is weak")
	private String password;

	public User() {
    super();
      }


public User(String username, String email, String password) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
}





public int getUserid() {
	return userid;
}


public void setUserid(int userid) {
	this.userid = userid;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}



}
