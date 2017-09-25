package testcases;

import org.testng.annotations.Test;

import actions.Login_Action;
import pages.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@SuppressWarnings("unused")
public class testcase1 {
	
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
	
	 @BeforeTest
	  public void beforeTest() throws Exception {
		  
		  	DOMConfigurator.configure("log4j.xml");
		  
		  	sTestCaseName = this.toString();
		  	
		  	sTestCaseName = Utils.getTestCaseName(this.toString());
			
		  	Log.startTestCase(sTestCaseName);
			
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		
			iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.TestCaseName);
			
			driver= Utils.OpenBrowser(iTestCaseRow);
			
			new BaseClass(driver);  
	        }
  @Test
  public void main() throws Exception {
	  
	  try{
		  
		  Login_Action.execute(iTestCaseRow);
		  if(BaseClass.bResult==true){
				ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Result);
				  Utils.takeScreenshot(driver, sTestCaseName);
			}
		  else{
				throw new Exception("Test Case Failed because of Verification");
			}
	  }
	  catch (Exception e){
		  ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Result);
		  Utils.takeScreenshot(driver, sTestCaseName);
		  Log.error(e.getMessage());
		  throw (e);
	  }
  }

  @AfterTest
  public void afterTest() {
	    Log.endTestCase(sTestCaseName);
	    driver.close();
	    
  		}
  


}
