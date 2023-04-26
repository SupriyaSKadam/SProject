package testNGFlag;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupFlag {

	@Test(groups = "FUNCTIONAL")
	public void ft1() {
		Reporter.log("ft1 is executed", true);
	}

	@Test(groups = "SMOKE")
	public void st1() {
		Reporter.log("st1 is executed",true);
	}
	
	@Test(groups = "INTEGRATION")
	public void it1() {
		Reporter.log("it1 is executed",true);
	}
//------------------------------------------------------------------------------------------------

	@Test(groups = "FUNCTIONAL")
	public void ft2() {
		Reporter.log("ft2 is executed", true);
	}

	@Test(groups = "SMOKE")
	public void st2() {
		Reporter.log("st2 is executed",true);
	}
	
	@Test(groups = "INTEGRATION")
	public void it2() {
		Reporter.log("it2 is executed",true);
	}
//--------------------------------------------------------------------------------------------------

	@Test(groups = "FUNCTIONAL")
	public void ft3() {
		Reporter.log("ft3 is executed", true);
	}

	@Test(groups = "SMOKE")
	public void st3() {
		Reporter.log("st3 is executed",true);
	}
	
	@Test(groups = "INTEGRATION")
	public void it3() {
		Reporter.log("it3 is executed",true);
	}
//---------------------------------------------------------------------------------------------------

	@Test(groups = "FUNCTIONAL")
	public void ft4() {
		Reporter.log("ft4 is executed", true);
	}

	@Test(groups = "SMOKE")
	public void st4() {
		Reporter.log("st4 is executed",true);
	}
	
	@Test(groups = "INTEGRATION")
	public void it4() {
		Reporter.log("it4 is executed",true);
	}
//-----------------------------------------------------------------------------------------------------

	@Test(groups = "FUNCTIONAL")
	public void ft5() {
		Reporter.log("ft5 is executed", true);
	}

	@Test(groups = "SMOKE")
	public void st5() {
		Reporter.log("st5 is executed",true);
	}
	
	@Test(groups = "INTEGRATION")
	public void it5() {
		Reporter.log("it5 is executed",true);
	}
//-----------------------------------------------------------------------------------------------------

	@Test(groups = "FUNCTIONAL")
	public void ft6() {
		Reporter.log("ft6 is executed", true);
	}

	@Test(groups = "SMOKE")
	public void st6() {
		Reporter.log("st6 is executed",true);
	}
	
	@Test(groups = "INTEGRATION")
	public void it6() {
		Reporter.log("it6 is executed",true);
	}
	
}

