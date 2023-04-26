package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollLeft {
    public static void main(String[] args) throws InterruptedException {
	
    	System.setProperty("webdriver.geckodriver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//ScrollLeft
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(1000,0)");
}
}
