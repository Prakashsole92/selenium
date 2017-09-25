package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

public class Home_Page extends BaseClass{
	
	
	private static WebElement element = null;
	
	public Home_Page(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement Hover_SignIn() throws Exception {
		
		try {
		element= driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[3]"));
		Log.info("SignIn Hover button is found on the Home Page");
    }
		catch (Exception e){
   		Log.error("SignIn Hover button is not found on the Home Page");
   		throw(e);
   		}
		
		return element;
		
	}

public static WebElement Button_SignIn() throws Exception {
		
		try {
		element= driver.findElement(By.className("nav-action-inner"));
		  System.out.println("hello");
		  
	    System.out.println(element.getText());
		Log.info("SignIn button is found on the Home Page");
    }
		catch (Exception e){
   		Log.error("SignIn button is not found on the Home Page");
   		throw(e);
   		}
		
		return element;
		
	}

public static WebElement Welcome_text() throws Exception {
	
	try {
	element= driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[3]\r\n"));
	Log.info("Logged in link displayed");
}
	catch (Exception e){
		Log.error("Logged in link not displayed");
		throw(e);
		}
	
	return element;
	
}
}
