package z.SelfPractice.Frameworks.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D1_HardAssert {


	@Test
	public void create() {
		
		System.out.println("Java");
		System.out.println("Python");
		Assert.assertEquals(true, true);
		System.out.println("selenium");
		System.out.println("Automation");
	}
	
	@Test
	public void name() {
		
		String actual="Shobha";
		String expected="ShobhaRani";
		Assert.assertEquals(actual, expected);
	}
}
