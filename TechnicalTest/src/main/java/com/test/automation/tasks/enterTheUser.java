package com.test.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.test.automation.user_interfaces.registrationPage.NAME;
import static com.test.automation.user_interfaces.registrationPage.LAST_NAME;
import static com.test.automation.user_interfaces.registrationPage.DOCUMENT;
import static com.test.automation.user_interfaces.registrationPage.EMAIL;
import static com.test.automation.user_interfaces.registrationPage.EMAIL_CONFIR;
import static com.test.automation.user_interfaces.registrationPage.PASSWORD;
import static com.test.automation.user_interfaces.registrationPage.PASSWORD_CONFIR;
import static com.test.automation.user_interfaces.registrationPage.SEND;

import com.test.automation.models.UserPersonalInformation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class enterTheUser implements Task{
	
	UserPersonalInformation userInf = new UserPersonalInformation();
	private String Email;
	
	public enterTheUser(String email) {
		this.Email = email;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(userInf.getName()).into(NAME));
		actor.attemptsTo(Enter.theValue(userInf.getLastName()).into(LAST_NAME));
		actor.attemptsTo(Enter.theValue(userInf.getDocument()).into(DOCUMENT));
		if(Email == null) {
			actor.attemptsTo(Enter.theValue(userInf.getEmail()).into(EMAIL));
			actor.attemptsTo(Enter.theValue(userInf.getEmail()).into(EMAIL_CONFIR));
		}else {
			actor.attemptsTo(Enter.theValue(Email).into(EMAIL));
			actor.attemptsTo(Enter.theValue(Email).into(EMAIL_CONFIR));
		}
		actor.attemptsTo(Enter.theValue(userInf.getPassword()).into(PASSWORD));
		actor.attemptsTo(Enter.theValue(userInf.getPassword()).into(PASSWORD_CONFIR));
		
		actor.attemptsTo(Click.on(SEND));
	}
	
	public static enterTheUser PersonalInformation(String email) {
		return instrumented(enterTheUser.class, email);
	}

}
