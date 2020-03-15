package com.test.automation.models;

public class UserInformation {
	
	private String user;
	private String pass;
	
	public UserInformation(String User, String Pass) {
		this.user = User;
		this.pass = Pass;
	}
	
	public String getUserName()
	{
		return user;
	}
	
	public String getPassword()
	{
		return pass;
	}

}
