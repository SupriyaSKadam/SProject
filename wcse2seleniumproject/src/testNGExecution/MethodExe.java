package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExe {
  @Test
  public void method1()
  {
	  long threadid = Thread.currentThread().getId();
	  Reporter.log(threadid+" is a Threadid",true);
  }
  
  @Test
  public void method2()
  {
	  long threadid = Thread.currentThread().getId();
	  Reporter.log(threadid+" is a Threadid",true);	  
  }
}
