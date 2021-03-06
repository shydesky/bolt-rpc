package com.fmgame.bolt.benchmark.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Person {

	private String name;

	private PersonFullName fullName;

	private Date birthday;

	private List<String> phoneNumber;

	private List<String> email;

	private Map<String, String> address;

	private List<Person> friends;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonFullName getFullName() {
		return fullName;
	}

	public void setFullName(PersonFullName fullName) {
		this.fullName = fullName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<String> getEmail() {
		return email;
	}

	public void setEmail(List<String> email) {
		this.email = email;
	}

	public Map<String, String> getAddress() {
		return address;
	}

	public void setAddress(Map<String, String> address) {
		this.address = address;
	}

	public List<Person> getFriends() {
		return friends;
	}

	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}

}
