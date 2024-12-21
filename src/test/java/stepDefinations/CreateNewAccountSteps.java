package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import framework.pages.CreateAccountPage;
import framework.pages.LandingPage;
import framework.pages.MyAccountsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewAccountSteps 
{
	WebDriver driver;
	LandingPage landingPage;
	CreateAccountPage createAccountPage;
	MyAccountsPage myAccountPage;
	
	
	
	@Given("user is present on the create new account page")
	public void user_is_present_on_the_create_new_account_page() {
		
		System.out.println("Create New Account step 1st...");
		driver = DriverFactory.returnDriver();
		landingPage = new LandingPage(driver);
		createAccountPage = landingPage.moveToCreateAccountPage();
		
	}

	@When("^user enters (.*) (.*) in correct format$")
	public void user_enters_firstname_lastname_in_correct_format(String FirstName, String LastName) {
		System.out.println("Create New Account step 2nd..............");
		createAccountPage.fillPersonalDetails(FirstName, LastName);
	}

	@When("^user enter (.*) (.*) and (.*)$")
	public void user_enter_email_password_and_confirmpassword(String email,String password,String confirmPassword) {

		createAccountPage.fillSignInInformationDetails(email, password, confirmPassword);
	}
	

	@When("user clicks on the create new account button")
	public void user_clicks_on_the_create_new_account_button() {
		myAccountPage = createAccountPage.clickOnCreateNewAccountButton();
	
	}

	@Then("user should see a message account created successfully")
	public void user_should_see_a_message_account_created_successfully() {
	    
		
		Assert.assertTrue(myAccountPage.isAt(), "Account Not created");
		
	}
	
	
}
