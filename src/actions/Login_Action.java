package actions;

import org.testng.Reporter;

import pages.Home_Page;
import pages.Login_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class Login_Action {

	
	
	public static void execute(int iTestCaseRow)throws Exception{
		
		Utils.mouseHoverAction(Home_Page.Hover_SignIn());
		
		//Home_Page.Button_SignIn().click();
		
				String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Username);
				Login_Page.textbox_Email().sendKeys(sUserName);
		   		Log.info(sUserName+" is entered in UserName text box" );   
		
		   		
		   		String sPassWord = ExcelUtils.getCellData(iTestCaseRow, Constant.Password);
		   		Login_Page.textbox_Password().sendKeys(sPassWord);
		   		Log.info(sPassWord+" is entered in Password text box" );
		
		   		Login_Page.button_Login().click();
		 		Log.info("Click action is performed on Submit button");
		 		
		 		Utils.waitForElement(Home_Page.Welcome_text());
		 		Reporter.log("SignIn Action is successfully perfomred");
	 
	}
}
