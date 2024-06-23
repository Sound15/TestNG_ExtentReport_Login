package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase is going to execute");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase is passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase is failed");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase is skipped");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("");
	}
	
	public void onStart(ITestContext context) {
		System.out.println("Before Everything");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("After Everything");
	}
}
