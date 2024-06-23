package testNG;

import org.testng.annotations.Test;

public class Dependencies {
	@Test
	public void highSchool() {
		System.out.println("HighSchool");
	}
	
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("Higher Secondary");
	}
	
	@Test(dependsOnMethods="higherSecondary")
	public void engineering() {
		System.out.println("Engineering");
	}

}
