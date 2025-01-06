package z.SelfPractice.Frameworks.DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class B_InsertingData {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./src/test/resources/self_ddt_RM.properties");//Read Mode
		
		Properties pro = new Properties();
		pro.setProperty("url", "https://www.saucedemo.com/v1/");
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		
		//write mode
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/self_ddt_RM.properties");
		
		pro.store(fos, "#CommonData");
		
		

	}

}
