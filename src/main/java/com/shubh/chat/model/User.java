package com.shubh.chat.model;

public class User {

	private String firstName;
	private String lastName;
	private String shortName;
	private String userType;

	public User(String firstName, String lastName, String shortName, String userType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.shortName = shortName;
		this.userType = userType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
