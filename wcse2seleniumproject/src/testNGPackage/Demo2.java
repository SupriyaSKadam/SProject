package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void m1() {
	  int a=6;
	  int b=0;
	  int res=a/b;
	  Reporter.log("This is m1!!"+res,true);
  }
  
  @Test
  public void m2() {
	  Reporter.log("This is m2()",true);
  }
  
  @Test
  public void m3() {
	  Reporter.log("This is m3()",true);
  }
  
}
