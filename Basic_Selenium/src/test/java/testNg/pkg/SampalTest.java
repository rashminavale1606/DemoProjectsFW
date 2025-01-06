package testNg.pkg;

import org.testng.annotations.Test;

public class SampalTest {
	
	@Test(invocationCount = 3)		//(priority = -1)  //(priority = 1) || testNg can accept -ve value as well
	public void createContact() {
		
		//    .  
		// i used above dot to check if create() fails will it give the desired o/p 
		//result: { failure: 1 [create] || skips: 2 [modify, delete]  } ---> if create method fails
		System.out.println("Contact Created!");
	}
	
	@Test 		//(enabled = false)	//(dependsOnMethods ="createContact") //(priority = 0)  //(priority = 2)  cant give priority if using dependson
	public void modifyContact() {
		
		System.out.println("Contact Modified!");
	}
	
	@Test(dependsOnMethods = "createContact" )										//(priority = 1)  //(priority = 3)
	public void deleteContact() {
		
		System.out.println("Contact Deleted!");
	}
	
	/*
	 * 
	 * @Test //(priority = -1)  //(priority = 1) || testNg can accept -ve value as well
	 * 
	 * @Test //(enabled = false)	//(dependsOnMethods ="createContact") //(priority = 0)  //(priority = 2)  cant give priority if using dependson
	 * 
	 * (invocationCount = 3)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

}
