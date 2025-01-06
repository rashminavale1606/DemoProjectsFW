package z.SelfPractice.Frameworks.TestNG;

import org.testng.annotations.Test;

public class A_Sample_Priority {

	@Test(priority = -1)
	public void createContact() {
		System.out.println("createContact");
	}
	
	@Test(priority = 0)
	public void modifyContact() {
		System.out.println("modifyContact");
	}
	
	@Test(priority = 2)
	public void deleteContact() {
		System.out.println("deleteContact");
	}
}
