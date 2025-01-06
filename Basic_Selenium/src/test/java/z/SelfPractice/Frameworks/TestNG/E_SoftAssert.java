package z.SelfPractice.Frameworks.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class E_SoftAssert {
	@Test
	public void create() {

		System.out.println("Java");
		System.out.println("Python");

		SoftAssert soft = new SoftAssert();
		soft.assertEquals(true, true);

		System.out.println("selenium");
		System.out.println("Automation");

		soft.assertAll();
	}

	@Test
	public void name() {

		String actual = "Shobha";
		String expected = "ShobhaRani";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(true, false);
		
		soft.assertAll();
	
	}
}
