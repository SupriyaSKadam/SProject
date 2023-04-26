package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag {
	@Test
	  public void login() {
			
			int res=5/0;
			Reporter.log("Login Method",true);
	  }
		
		@Test(dependsOnMethods = "login",alwaysRun = true)
		  public void createuser() {
				Reporter.log("CreateUser Method",true);
		  }
		
		@Test
		  public void logout() {
				Reporter.log("Logout Method",true);
		  }
}
