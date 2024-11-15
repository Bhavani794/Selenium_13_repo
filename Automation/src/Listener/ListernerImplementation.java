package Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListernerImplementation  implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Script failed",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test script is passed",true);
		}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Script is skippeed",true);
	}
	
	

}
