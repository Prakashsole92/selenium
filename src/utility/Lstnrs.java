package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Lstnrs implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Exceution of Test suites has been Completed");
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Exceution of Test suites has been started");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println(Result.getName()+ "test has started");
		
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println(Result.getName()+ "test passed");
		
		
	}
	
	

}
