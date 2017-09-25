package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BaseClass;
import utility.Log;

public class Login_Page extends BaseClass {
    private static WebElement element = null;
 
 public Login_Page(WebDriver driver){
     	super(driver);
 }     

 
 public static WebElement textbox_Email() throws Exception{
 	try{
         element = driver.findElement(By.id("ap_email"));
         Log.info("Username text box is found on the Login Page");
 	}catch (Exception e){
    		Log.error("UserName text box is not found on the Login Page");
    		throw(e);
    		}
    	return element;
     }
 
 public static WebElement textbox_Password() throws Exception{
 	try{
     	element = driver.findElement(By.id("ap_password"));
         Log.info("Password text box is found on the Login page");
 	}catch (Exception e){
 		Log.error("Password text box is not found on the Login Page");
    		throw(e);
    		}
    	return element;
 }
 
 public static WebElement button_Login() throws Exception{
 	try{
     	element = driver.findElement(By.id("signInSubmit"));
         Log.info("Submit button is found on the Login page");
 	}catch (Exception e){
 		Log.error("Submit button is not found on the Login Page");
    		throw(e);
    		}
 	return element;
 	
}
}