
package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	String name1="Agni";
	String name2="agni";
	boolean value1=true;
	boolean value2=false;
	@Test
	public void checkEquals() {
	//Assert.assertEquals(name1,"Agni");
    //Assert.assertNotEquals(name2,"agni");
    //Assert.assertTrue(value1,"This should not be false");
	Assert.assertFalse(value1,"This should not be true");
    
	}
}
