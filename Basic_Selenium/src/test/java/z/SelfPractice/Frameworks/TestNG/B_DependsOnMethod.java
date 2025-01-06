package z.SelfPractice.Frameworks.TestNG;

import org.testng.annotations.Test;

public class B_DependsOnMethod {

	@Test
	public void createContact() {
		
		//System.out.println(arr[5]);
		System.out.println("createContact");
	}
	
	@Test(dependsOnMethods = "createContact", priority = 0)
	public void modifyContact() {
		System.out.println("modifyContact");
	}
	
	@Test(dependsOnMethods = "createContact")
	public void deleteContact() {
		System.out.println("deleteContact");
	}
	
	@Test
	public void email() {
		System.out.println("email");
	}
}
