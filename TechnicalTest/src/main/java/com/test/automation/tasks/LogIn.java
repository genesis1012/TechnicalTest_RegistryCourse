package com.test.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.test.automation.user_interfaces.homePage.USER_NAME;
import static com.test.automation.user_interfaces.homePage.PASSWORD;
import static com.test.automation.user_interfaces.homePage.LOG_IN;

import com.test.automation.models.UserInformation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LogIn implements Task{
	
	private UserInformation User;
	
	public LogIn(UserInformation user) {
		this.User = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(User.getUserName()).into(USER_NAME),
				Enter.theValue(User.getPassword()).into(PASSWORD));
		actor.attemptsTo(Click.on(LOG_IN));
	}
	
	public static LogIn whit(UserInformation user) {
		return instrumented(LogIn.class, user);
	}

}
