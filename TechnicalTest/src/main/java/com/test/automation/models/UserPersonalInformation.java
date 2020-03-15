package com.test.automation.models;

import java.util.Locale;

import com.github.javafaker.Faker;

public class UserPersonalInformation {
	
	private String name;
	private String lastName;
	private String document;
	private String email;
	private String password;
	
	public UserPersonalInformation() {
		Faker faker = new Faker(new Locale("es"));
		
		this.name = faker.name().firstName();
		this.lastName = faker.name().lastName();
		this.document = faker.idNumber().valid();
		this.email = faker.internet().emailAddress();
		this.password = faker.number().digits(5);
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getDocument() {
		return document;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}

}
