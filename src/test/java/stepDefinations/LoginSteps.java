package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import framework.pages.HomePage;
import framework.pages.LandingPage;
import framework.pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	WebDriver driver;
	LandingPage landingPage;
	SignInPage signInPage;
	HomePage homePage;
	
	@Given("user is on the landing page of the application")
	public void user_is_on_the_landing_page_of_the_application() {
		driver = DriverFactory.returnDriver();
		landingPage = new LandingPage(driver);
	}

	@When("^user provides correct (.*) and (.*)$")
	public void user_provides_correct_username_and_password(String Username,String Password) {

		signInPage = landingPage.moveToSignPage();
		signInPage.enterDetails(Username, Password);
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	
		homePage = signInPage.clickOnLoginButton();
	}

	@Then("^user should see (.*) login message$")
	public void user_should_see_successfull_login_message(String Result) {

		Assert.assertTrue(homePage.isAt(), "Login unsuccessful");
	}
	
	
	
	
}
