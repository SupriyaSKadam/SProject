package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
 
	@Test(description = "This is FTC!!!")
  public void search() {
		Reporter.log("SQL",true);
  }
}
