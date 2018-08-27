package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;






public class CommonActions {
public static	WebDriver d;
	public static String relativePath(){
		String localDir = System.getProperty("user.dir");
		return localDir;
	}
	
	public static  void handle(){
		try{
		Thread.sleep(3000);
		for (String winHandle : d.getWindowHandles()) {
			System.out.println(winHandle);
		    d.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		
		}}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	public  static void swithtoFrame(String k){
		try{
			System.out.println("Swithching to frame  "+k);WebDriver frame=d.switchTo().frame(k);
		
			System.out.println(frame.getTitle());}
		catch(Exception e){
			
			try {
				throw new Exception ("invalid frame Name",e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public static  void backTomainwin(){
		try {
			d.switchTo().defaultContent();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
	}
	
	public static   void ddown(WebElement drop, String text){
		  
		try{
			
		boolean matched = false;
		
		
		  
		WebElement mySelectElement = searchClickableElement(d, drop);
		Select dropdown= new Select(mySelectElement);
		
		dropdown.selectByVisibleText(text);
		
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		/*List<WebElement> options=dropdown.getOptions();
	
		
		for(WebElement option:options){
			if(text.equals(option.getText())){
				matched=true;
				
			}
		}
		if(!matched){
			
				ReportActionKeys.writeLogInCaseOfFail(text+" is invalid");
				ReportActionKeys.addScreenShotInReport("Invalid text");
			try {
				throw new Exception("Cannot locate element with text: "+text);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		}
		else{
		dropdown.selectByVisibleText(text);
	}
		
		if(!text.equals(dropdown.getFirstSelectedOption().getText())){
			ReportActionKeys.writeLogInCaseOfFail(text+" is not matched with dropdown text");
			ReportActionKeys.addScreenShotInReport("Invalid text");
			try {throw new Exception("selected option is wrong: "+text);}
		catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}*/
		
	
	}
	
	public static WebElement searchClickableElement(WebDriver d,WebElement xpath){
		WebDriverWait w = new WebDriverWait(d, 30);
		WebElement ele=null;
		
		try{
			
		if(	isElementPresent(xpath)){
			
		ele=w.until(ExpectedConditions.elementToBeClickable(xpath));
		return ele;}
		else{
			try {
				
			
			throw new Exception("@@@@@@@@@@");
		} 
			catch (Exception e) {
				System.out.println("Catch---1");
				e.printStackTrace();
				
		}}}
		catch(Exception e){
			System.out.println("case failed");
			
			System.out.println("case failed22222222");
			
			try {
				throw new Exception("invalid locator",e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return null;
		
		
		
		
		
		
		
	}
	
	
	public static boolean isElementPresent(WebElement locatorKey) {
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {WebElement ele=locatorKey;
		  
		   return true;
		} catch (NoSuchElementException e) {
		   return false;
		}
	}

	
	
	public static void customerIdSearch(WebElement xpathofImg,String custId){
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String parent=d.getWindowHandle();
		searchClickableElement(d, xpathofImg).click();
		for (String winHandle : d.getWindowHandles()) {
		    d.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		d.manage().window().maximize();
		
		ddownbyindex(d.findElement(By.xpath("//select[@name='customerSearch']")),1);
		searchClickableElement(d, d.findElement(By.xpath("//input[@id='txtCID']"))).sendKeys(custId);
		searchClickableElement(d,d.findElement(By.xpath("//input[@id='txtCID']/following::img"))).click();
		searchClickableElement(d,d.findElement(By.xpath("//input[@id='txtCID']/following::input[1]"))).click();
		searchClickableElement(d,d.findElement(By.xpath("//input[@id='txtCID']/preceding::img"))).click();
			d.switchTo().window(parent);
			}
	
	
	public static   void ddownbyindex(WebElement drop,int index){
		WebElement mySelectElement = searchClickableElement(d, drop);
		Select dropdown= new Select(mySelectElement);
		
		dropdown.selectByIndex(index);}
	
	
	
	
	
	
	
	
	

}
