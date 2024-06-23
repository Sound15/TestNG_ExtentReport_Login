package testNG;
import org.testng.annotations.Test;


public class Sample_Testng {
	@Test(priority=1,enabled=false)
	public void firstTestCase() {
		System.out.println("This is first test case");
	}
	
	@Test(priority=0)
	public void secondTestCase() {
		System.out.println("This is second test case");
	}
}
