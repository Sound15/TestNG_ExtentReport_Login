package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {
	WebDriver driver;
	long startTime;
	long endTime;
	@BeforeSuite
	public void launchBrowser() {
		startTime=System.currentTimeMillis();
		driver=new ChromeDriver();
	}
	@Test
	public void OpenGoogle() {
		driver.get("http://www.google.co.in");
	}
	@Test
	public void OpenBing() {
		driver.get("https://www.bing.com/");
	}
	@Test
	public void openYahoo() {
		driver.get("https://www.yahoo.com/?guccounter=1");
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken "+totalTime);
		
	}

}
