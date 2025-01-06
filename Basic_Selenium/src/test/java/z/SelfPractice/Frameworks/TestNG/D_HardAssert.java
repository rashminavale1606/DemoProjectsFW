package z.SelfPractice.Frameworks.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D_HardAssert {

	@Test
	public void create() {
		
		System.out.println("Java");
		System.out.println("Python");
		Assert.assertEquals(false, true);
		System.out.println("selenium");
		System.out.println("Automation");
	}
	
	@Test
	public void name() {
		
		String expString="Shobha";
		String actString="Shobha";
		Assert.assertEquals(expString, actString);
	}
}
