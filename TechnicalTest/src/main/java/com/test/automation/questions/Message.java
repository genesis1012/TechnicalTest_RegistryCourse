package com.test.automation.questions;

import static com.test.automation.user_interfaces.registrationPage.SUCCESSFUL_MESSAGE;
import static com.test.automation.user_interfaces.registrationPage.FAIL_MESSAGE;

import net.serenitybdd.screenplay.Question;

public class Message {
	
	public static Question<Boolean> successful() {
        return actor -> SUCCESSFUL_MESSAGE.resolveFor(actor).isVisible();
    }
	
	public static Question<Boolean> fail() {
        return actor -> FAIL_MESSAGE.resolveFor(actor).isVisible();
    }

}
