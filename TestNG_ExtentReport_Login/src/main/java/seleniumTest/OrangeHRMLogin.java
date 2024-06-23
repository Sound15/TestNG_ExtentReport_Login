package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class OrangeHRMLogin {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement userName=driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.click();
		
		WebElement time=driver.findElement(By.linkText("Time"));
		time.click();
		
		WebElement namebef=driver.findElement(By.xpath("//*[@placeholder=\"Type for hints...\"]"));
		namebef.sendKeys("Bob Jawaharlal Tester");
		
		//driver.quit();

	}

}
