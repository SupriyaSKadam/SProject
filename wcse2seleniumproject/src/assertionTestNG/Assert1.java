package assertionTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
  @Test
  public void validLogin() {
	  Reporter.log("Launch the browser",true);
	  Reporter.log("Launch the web app by using url",true);
	  
	  SoftAssert sa = new SoftAssert();//soft assert
	  sa.assertEquals(false, false);
	  Reporter.log("Log in page will be displayed!!",true);
	  Reporter.log("Perform the login operation!!",true);
	  
	  Assert.assertEquals(true, false);//hard assert
	  Reporter.log("Homepage will be displayed!!",true);
	  Reporter.log("Logout",true);
  }
}

