package com.test.automation.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("https://euno.lms.doctustest.com/")
public class homePage extends PageObject{
	
	@WhenPageOpens
	public void waitUntilMainElementsAppears() {
		getDriver().manage().window().maximize();
	}
		
	public static final Target USER_NAME = Target.the("user Name")
			.locatedBy("");
	
	public static final Target PASSWORD = Target.the("password")
			.locatedBy("");
	
	public static final Target LOG_IN = Target.the("Log In")
			.locatedBy("");
	
	public static final Target FAIL_MESSAGE = Target.the("Fail Message")
			.locatedBy("");
	
	public static final Target SIGN_UP = Target.the("sign Up")
			.locatedBy("");

}
