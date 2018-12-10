package com.nit.logback.model;

import java.time.LocalDateTime;

public class Student {
	private String firstName;
	private String lastName;
	private LocalDateTime localDateTime;

	public Student() {
	}

	public Student(String firstName, String lastName, LocalDateTime localDateTime) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.localDateTime = localDateTime;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
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

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", localDateTime=" + localDateTime + "]";
	}

}
