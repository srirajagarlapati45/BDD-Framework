package step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pomPages.Pom_SavingsAccount;
import pom_Page_Actions.Savings_Account_Page;

public class SavingsAccountCreationPage extends CommonActions{
	Pom_SavingsAccount obj=new Pom_SavingsAccount();
	
	Savings_Account_Page actObj=new Savings_Account_Page();
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.gecko.driver",relativePath()+"\\Drivers\\geckodriver.exe");
		d = new FirefoxDriver();
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        d.get("http://192.168.0.32:9090/Wings_4.9.0_2/Login/SlogParent.jsp");
		}
	
	
 
	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		d.findElement(By.xpath("//input[@id='txtUserId']")).sendKeys("Admin-001"); 	 
	    d.findElement(By.xpath("//input[@id='txtPassWd']")).sendKeys("vsofthyd");
	    d.findElement(By.xpath("//input[@id='Button1']")).click();
		}
 
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
	
	
	@Given("^application main screen$")
	public void application_main_screen() throws Throwable {
		System.setProperty("webdriver.gecko.driver",relativePath()+"\\Drivers\\geckodriver.exe");
		d = new FirefoxDriver();
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        d.get("http://192.168.0.32:9090/Wings_4.9.0_2/Login/SlogParent.jsp");
        d.findElement(By.xpath("//input[@id='txtUserId']")).sendKeys("Admin-001"); 	 
	    d.findElement(By.xpath("//input[@id='txtPassWd']")).sendKeys("vsofthyd");
	    d.findElement(By.xpath("//input[@id='Button1']")).click();
		
		CommonActions.handle();
		
		
		}
	@When("^user open savings account with cut_id \"(.*)\" and operating_inst \"(.*)\"$")
	public void user_enters_UserName_and_Password(String cut_id,String operating_inst) throws Throwable {
		d.findElement(By.xpath("//div[@class='header-link hide-menu']")).click(); 	 
	    d.findElement(By.xpath("//a[@href='../ExecutableMenuServlet?serialno=1&url=/Header/executablesWidget.jsp&menuType=MainMenu']")).click();
	    CommonActions.swithtoFrame("myFrame");
	  
	    d.findElement(By.xpath("//h4[contains(text(),'Account')]")).click(); 	
	    CommonActions.backTomainwin();
	    CommonActions.swithtoFrame("myFrame");
	    d.findElement(By.xpath("//h5[contains(text(),'Savings Bank ')]")).click(); 	
	    CommonActions.backTomainwin();
	    CommonActions.swithtoFrame("myFrame");
	    actObj.selectProductName("TestSA");
	    actObj.selectnatureOfAcc("Single");
	    actObj.select_operator_Dropdown(operating_inst);
	    actObj.CustomerId_selection(d.findElement(By.xpath("//input[@id='txtCustName']//following::img[1]")), cut_id);
	    actObj.operatingInstrument_Dropdown("SELF IN GUJRATI");
	    actObj.Signature_sendkeys("Raja");
	    
	    

		}

}
