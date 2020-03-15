package com.test.automation.step_definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

import com.test.automation.tasks.LogIn;
import com.test.automation.tasks.openWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.test.automation.models.UserInformation;
import com.test.automation.questions.LogInSuccessful;


public class LogInStepDefinition {
		
	@Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	@Given("^the user is on home page$")
	public void the_user_is_on_home_page() {
		theActorCalled("Heriberto").wasAbleTo(openWeb.HomePage());
	}

	@When("^Enter the userName (.*) and (.*)$")
	public void enter_the_userName_and(String userName, String password) {
		theActorInTheSpotlight().attemptsTo(LogIn.whit(new UserInformation(userName, password)));
	}

	@Then("^Login (.*)$")
	public void login(String result) {
		if(result.equals("True")) {
			theActorInTheSpotlight().should(seeThat(LogInSuccessful.Performed(), is("True")));
		}else {
			theActorInTheSpotlight().should(seeThat(LogInSuccessful.Performed(), is("Fail")));
		}
	}

}
