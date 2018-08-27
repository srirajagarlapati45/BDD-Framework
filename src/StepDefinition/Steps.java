package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.CommonActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends CommonActions {
	 @Given("^Open the Firefox and launch the application$")				
	    public void open_the_Firefox_and_launch_the_application() throws Throwable							
	    {		
		 System.setProperty("webdriver.gecko.driver",CommonActions.relativePath()+"\\Drivers\\geckodriver.exe");
			d = new FirefoxDriver();
	        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	        d.manage().window().maximize();			
	        d.get("http://demo.guru99.com/v4");
	    }		

	 @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")			
	    public void enter_the_Username_and_Password(String username,String password) throws Throwable 							
	    {		
	       d.findElement(By.name("uid")).sendKeys(username);					
	       d.findElement(By.name("password")).sendKeys(password);					
	    }		

	   	

}
