package com.test.automation.user_interfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class registrationPage extends PageObject{
	
	public static final Target NAME = Target.the("User Name")
			.locatedBy("");
	
	public static final Target LAST_NAME = Target.the("User Last Name ")
			.locatedBy("");
	
	public static final Target DOCUMENT = Target.the("User Document")
			.locatedBy("");
	
	public static final Target EMAIL = Target.the("User Email")
			.locatedBy("");
	
	public static final Target EMAIL_CONFIR = Target.the("User Email Confir")
			.locatedBy("");
	
	public static final Target PASSWORD = Target.the("User Password")
			.locatedBy("");
	
	public static final Target PASSWORD_CONFIR = Target.the("User Password Confir")
			.locatedBy("");
	
	public static final Target SEND = Target.the("Send")
			.locatedBy("");
	
	public static final Target FAIL_MESSAGE = Target.the("Fail Message")
			.locatedBy("");
	
	public static final Target SUCCESSFUL_MESSAGE = Target.the("Successful Message")
			.locatedBy("");

}
