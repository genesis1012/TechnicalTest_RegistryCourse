package com.test.automation.step_definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

import com.test.automation.questions.Message;
import com.test.automation.tasks.enterTheUser;
import com.test.automation.tasks.goToRegistration;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UserRegistrationStepDefinition {
	
	@Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	@Given("^I am on the registration screen$")
	public void i_am_on_the_registration_screen() {
		theActorCalled("Heriberto").wasAbleTo(goToRegistration.page());
	}


	@When("^Enter the user's personal information$")
	public void enter_the_user_s_personal_information() {
		theActorInTheSpotlight().attemptsTo(enterTheUser.PersonalInformation(null));
	}

	@Then("^Successful registration$")
	public void successful_registration() {
		theActorInTheSpotlight().should(seeThat(Message.successful(), is(true)));
	}

	@When("^enter incorrect user information (.*)$")
	public void enter_incorrect_user_information(String email) {
		theActorInTheSpotlight().attemptsTo(enterTheUser.PersonalInformation(email));
	}

	@Then("^registration (.*)$")
	public void registration(String status) {
	    if(status == "Success") {
	    	theActorInTheSpotlight().should(seeThat(Message.successful(), is(true)));
	    }else {
	    	theActorInTheSpotlight().should(seeThat(Message.fail(), is(true)));
	    }
	}
}
