package com.test.automation.questions;
import static com.test.automation.user_interfaces.homePage.FAIL_MESSAGE;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LogInSuccessful implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		if(FAIL_MESSAGE.resolveFor(actor).isVisible()) {
			return "Fail";
		}else {
			return "True";
		}
		
	}
	
	public static LogInSuccessful Performed() {
		return new LogInSuccessful();
	}

}
