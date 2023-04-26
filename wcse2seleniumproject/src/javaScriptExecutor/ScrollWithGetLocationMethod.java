package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollWithGetLocationMethod {
   public static void main(String[] args) throws InterruptedException {
	

   	System.setProperty("webdriver.geckodriver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
	    driver.get("https://www.swiggy.com/");
		WebElement download = driver.findElement(By.xpath("//img[@class='_3QGpR']"));
		Point loc = download.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
        //System.out.println(xaxis+" "+yaxis);
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//For ScrollDown
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,943)");
		
		//For ScrollUp
	    Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-943)");
 }

}
