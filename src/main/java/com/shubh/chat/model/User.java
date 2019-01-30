package com.shubh.chat.model;

public class User {

	private String firstName;
	private String lastName;
	private String shortName;
	private String userType;
	private String event;

	public User(String firstName, String lastName, String shortName, String userType, String event) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.shortName = shortName;
		this.userType = userType;
		this.event = event;
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

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}


}
