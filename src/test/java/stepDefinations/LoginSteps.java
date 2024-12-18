package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	
	@Given("user is on the landing page of the application")
	public void user_is_on_the_landing_page_of_the_application() {
		System.out.println("given statement");
	}

	@When("^user provides correct (.*) and (.*)$")
	public void user_provides_correct_username_and_password(String Username,String Password) {
		System.out.println(Username+" "+Password);
		
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	
	}

	@Then("^user should see (.*) login message$")
	public void user_should_see_successfull_login_message(String Result) {
		System.out.println("Result "+Result);
	}
	
	
	
	
}
