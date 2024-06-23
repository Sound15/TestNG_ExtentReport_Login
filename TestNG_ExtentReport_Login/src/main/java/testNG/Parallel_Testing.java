package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Testing {
	@Test
	public void openGoogle() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
	}
    @Test
	public void openBing() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
	}
}
