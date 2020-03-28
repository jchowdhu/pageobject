package stepDefinations;

import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import PageObject.LogInPage;
import PageObject.HomePage;
import PageObject.Varify_portalHomePage;
import Qaclickacademy.Maven_Test_Practice.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
// Tidy Gerkins extention for chrome to automate steps. 
public class Facebook_Steps extends BaseClass {
	/* @Given("^user is on facebook Homepage$")
	    public void user_is_on_facebook_face() throws Throwable {
	        System.out.println("I am in facebook home ");
	    }

	 @When("^user enter username \"([^\"]*)\" and pass word \"([^\"]*)\"$")
	 public void user_enter_username_and_pass_word(String arg1, String arg2) throws Throwable {
	     
	 }
	    @Then("^user click on submit button$")
	    public void user_click_on_submit_button() throws Throwable {
	    	
	    	System.out.println("login successfully");
          }
*/
public class QaclikAcademy extends BaseClass {
	@Given("^Intialize the browser with chrome$")
	public void intialize_the_browser_with_chrome() throws IOException {
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("^navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) {
		driver.get(arg1);

	}

	@Given("^click on log in button and land on secure signin page$")
	public void click_on_log_in_button_and_land_on_secure_signin_page() {

		HomePage hp = new HomePage(driver);
		hp.signin().click();
		if(hp.getpopupSize().size()>0) {
			hp.getpopup().click();
		}

	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) {

		LogInPage Lp = new LogInPage(driver);

		Lp.getemail().sendKeys(arg1);
		Lp.getpass().sendKeys(arg2);
		Lp.clickLoginButton().click();
	}
	@When("^user enter (.+) and (.+) and logs in$")
    public void user_enter_and_and_logs_in(String username, String password)  {
     

		LogInPage Lp = new LogInPage(driver);

		Lp.getemail().sendKeys(username);
		Lp.getpass().sendKeys(password);
		Lp.clickLoginButton().click();
	}

	@Then("^verify that user is succesfully loged in$")
	public void verify_that_user_is_succesfully_loged_in() {
		Varify_portalHomePage hp = new Varify_portalHomePage(driver);
		hp.getSearchBox().isDisplayed();
		Assert.assertTrue(hp.getSearchBox().isDisplayed());
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() {
		driver.close();
	}

}
