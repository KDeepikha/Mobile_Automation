package Steps;

import io.cucumber.java.en.*;
import Pages.MainPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Addition {
	private AndroidDriver<MobileElement> driver;
	MainPage mpage;
	

	public Addition()
	{
		System.out.println("Launched");
		this.driver = Utilities.DriverManager.IniDriver();
		mpage = new MainPage(driver);
	}
	
	@Given("Verify app is Launched")
	public void verify_app_is_launched() {
	    
	    mpage.clickagree();
	    	}

	@Given("Enter First number {string}")
	public void enter_first_number(String string) {
		mpage.clickfive();
	    
	}

	@Given("Enter Operator as {string}")
	public void enter_operator_as(String string) {
	    mpage.clickplus();
	}

	@Given("Enter Second number {string}")
	public void enter_second_number(String string) {
	    mpage.clickfive();
	}

	@When("Operator is given as {string}")
	public void operator_is_given_as(String string) {
	   mpage.clickequal();
	}

	@Then("Result should be calculated and assertion was done with {string} and {string}")
	public void result_should_be_calculated_and_assertion_was_done_with_and(String string, String string2) {
		System.out.println("Result is displayed");
		driver.quit();
			}

}
