package testNg.pkg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public  void m1() {
		System.out.println("step 1");
		System.out.println("step 2");
		
	SoftAssert soft = new SoftAssert();
	
	soft.assertEquals(false, true);
		System.out.println("step 3");
		System.out.println("step 4");
		soft.assertAll();
		
		
		
	}
	
	@Test
	public void name() {
		
		String n1 = "Rashmi";
		String n2="Rashmi";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(true, false);
		soft.assertAll();
	}

}
