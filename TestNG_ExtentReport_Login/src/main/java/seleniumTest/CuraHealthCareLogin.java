package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CuraHealthCareLogin {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		
		WebElement make=driver.findElement(By.id("btn-make-appointment"));
		make.click();
		
		WebElement userName=driver.findElement(By.id("txt-username"));
		userName.sendKeys("John Doe");
		
		WebElement password=driver.findElement(By.id("txt-password"));
		password.sendKeys("ThisIsNotAPassword");
		
		WebElement login=driver.findElement(By.id("btn-login"));
		login.click();
		
		WebElement facility=driver.findElement(By.id("combo_facility"));
		Select selfac=new Select(facility);
		selfac.selectByVisibleText("Hongkong CURA Healthcare Center");
		
		WebElement apply=driver.findElement(By.id("chk_hospotal_readmission"));
		apply.click();
		
		WebElement program=driver.findElement(By.id("radio_program_medicaid"));
		program.click();
		
		WebElement datesel=driver.findElement(By.id("txt_visit_date"));
		datesel.click();
		WebElement next=driver.findElement(By.className("next"));
		next.click();
		WebElement date=driver.findElement(By.xpath("//td[contains(text(),\"11\")]"));
		date.click();
		
		WebElement text=driver.findElement(By.id("txt_comment"));
		text.sendKeys("For Knee Pain");
		
		WebElement book=driver.findElement(By.id("btn-book-appointment"));
		book.click();
		
		String expected="Appointment Confirmation";
		WebElement conform=driver.findElement(By.xpath("//h2"));
		String actual=conform.getText();
		if(actual.equalsIgnoreCase(expected)) {
			System.out.println("Success");
		}
				
		
		//driver.quit();
		

	}

}
