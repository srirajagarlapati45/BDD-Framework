package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import common.CommonActions;

public class Pom_SavingsAccount extends CommonActions{

	@FindBy(how=How.XPATH,using="//select[@id='productId']")
	@CacheLookup
	public
	WebElement Product_Name_DropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='natureOfAcc']")
	@CacheLookup
	public
	WebElement NatureOfAccount_Dropdown;
	
	@FindBy(how=How.XPATH,using="//select[@id='operator']")
	@CacheLookup
	public
	WebElement operator_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//select[@id='operator']")
	@CacheLookup
	public
	WebElement CustomerId_selection;
	
	
	@FindBy(how=How.XPATH,using="//select[@id='operatingInstrument']")
	@CacheLookup
	public
	WebElement operatingInstrument_Dropdown;
	
	
	
	
	
	@FindBy(how=How.XPATH,using="//input[@id='signatureCardNo']")
	@CacheLookup
	public WebElement Signature_Card_No;
	
}
