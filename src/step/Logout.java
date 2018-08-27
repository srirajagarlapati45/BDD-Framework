package step;

import org.openqa.selenium.By;

import common.CommonActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logout extends CommonActions {
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		d.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}

	@Then("^Message displayed Logout Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
	}
}
