package extentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportEx {
WebDriver driver;
ExtentReports extentReport;
ExtentSparkReporter sparkReporter;
ExtentTest testcase;
@Test
public void openGoogle() throws IOException {
	testcase=extentReport.createTest("Verify Google Title");
	testcase.log(Status.INFO, "Navigating to Google");
	driver.get("http://www.google.co.in");
	String title=driver.getTitle();
	testcase.log(Status.INFO,"Actual title:"+title);
	testcase.log(Status.INFO,"Expected title:"+"Google");
	testcase.log(Status.INFO,"Verification of actual and expected title");
	if(title.equals("Google")) {
		testcase.log(Status.PASS,"Actual title and expected title are equal");
	}else {
		testcase.log(Status.FAIL,"Actual title and expected title are not equal");
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("google.png");
		FileHandler.copy(sourceFile, destinationFile);
		testcase.addScreenCaptureFromPath("google.png");
	}
}
@BeforeSuite
public void launchBrowser() {
	extentReport=new ExtentReports();
	sparkReporter=new ExtentSparkReporter("ExtentReport.html");
	extentReport.attachReporter(sparkReporter);
	driver=new ChromeDriver();
	}
@AfterSuite
public void closeBrowser() {
	driver.quit();
	extentReport.flush();
}
}

