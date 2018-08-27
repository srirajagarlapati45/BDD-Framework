package pom_Page_Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;
import pomPages.Pom_SavingsAccount;

public class Savings_Account_Page extends CommonActions {
	
	
	Pom_SavingsAccount sav_page=PageFactory.initElements(d, Pom_SavingsAccount.class);
	
public void selectProductName(String text){
	ddown(sav_page.Product_Name_DropDown, text);
}

public void selectnatureOfAcc(String text){
	ddown(sav_page.NatureOfAccount_Dropdown, text);
}

public void select_operator_Dropdown(String text){
	ddown(sav_page.operator_Dropdown, text);
}

public void CustomerId_selection(WebElement ele,String custId){
	customerIdSearch(ele, custId);
}



public void operatingInstrument_Dropdown(String text){
	ddown(sav_page.operatingInstrument_Dropdown, text);
}



public void Signature_sendkeys(String text){
	sav_page.Signature_Card_No.sendKeys(text);
}

}
