package testNg.pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public static void m1() {
		System.out.println("step 1");
		System.out.println("step 2");
		
		Assert.assertEquals(false, true);
		System.out.println("step 3");
		System.out.println("step 4");
	}
	
	
	@Test
	public static void name() {
		
	
		String expDataString = "Rashmi";
		String actualDataString ="Rashmi";
		
		Assert.assertEquals(true, true);
		
	}

}
