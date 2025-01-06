package z.SelfPractice.Frameworks.TestNG;

import org.testng.annotations.Test;

public class C_InvocationCount {

	@Test
	public void createContact() {
		
		//System.out.println(arr[5]);
		System.out.println("createContact");
	}
	
	@Test(invocationCount = 2)
	public void modifyContact() {
		System.out.println("modifyContact");
	}
	
	@Test(invocationCount = 4)
	public void deleteContact() {
		System.out.println("deleteContact");
	}
	
	@Test(invocationCount = -6)
	public void email() {
		System.out.println("email");
	}
}
