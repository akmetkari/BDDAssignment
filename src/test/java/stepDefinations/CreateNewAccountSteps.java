package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewAccountSteps {

	@Given("user is present on the create new account page")
	public void user_is_present_on_the_create_new_account_page() {
		System.out.println("1. user is present ");
	}

	@When("^user enters (.*) (.*) in correct format$")
	public void user_enters_firstname_lastname_in_correct_format(String FirstName, String LastName) {
		System.out.println("2. user enter");
		System.out.println("First Name: " + FirstName+" Last Name: " + LastName);
	}

	@When("^user enter (.*) (.*) and (.*)$")
	public void user_enter_email_password_and_confirmpassword(String email,String password,String confirmPassword) {

		System.out.println(email+" "+password+" "+confirmPassword);
	}
	

	@When("user clicks on the create new account button")
	public void user_clicks_on_the_create_new_account_button() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user should see a message account created successfully")
	public void user_should_see_a_message_account_created_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	
}
