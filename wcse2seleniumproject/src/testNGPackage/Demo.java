package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void f() {

		Reporter.log("Happy Sunday!!", true);
	}

	@Test
	public void s1() {
		Reporter.log("Today is going to be great day!!!", true);
	}
	
	@Test
	public void s2() {
		Reporter.log("Hello TestNG!!",true);
	}
}