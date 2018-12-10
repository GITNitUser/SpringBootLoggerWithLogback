package com.nit.logback.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student1 {
	private String firstName;
	private String lastName;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS]X")
	private Timestamp timestamp;

	public Student1() {
	}

	public Student1(String firstName, String lastName, Timestamp timestamp) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.timestamp = timestamp;
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

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", timestamp=" + timestamp + "]";
	}
}
