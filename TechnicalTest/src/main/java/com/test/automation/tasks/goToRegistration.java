package com.test.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.test.automation.user_interfaces.homePage.SIGN_UP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class goToRegistration implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.wasAbleTo(openWeb.HomePage());
			actor.wasAbleTo(Click.on(SIGN_UP));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static goToRegistration page() {
		return instrumented(goToRegistration.class);
	}

}
