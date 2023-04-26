package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByAllMethod {

		public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   	 WebDriver driver=new ChromeDriver();
	   	 driver.manage().window().maximize();
	   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   	 driver.get("file:///C:/Users/hp/Desktop/Selenium%20Data/webelement/multiselectDropdown.html");
		 
	   	 WebElement carsDropDown = driver.findElement(By.name("cars"));
	   	 
	   	 Select sel = new Select(carsDropDown);
	   	  
	   	for(int i=0;i<5;i++)
   	     {
   		    sel.selectByIndex(i);
   		    Thread.sleep(2000);
    	 }
   	    for(int i=0;i<5;i++)
   	     {
   	   	    sel.deselectAll();
	    
	     }
    }
}