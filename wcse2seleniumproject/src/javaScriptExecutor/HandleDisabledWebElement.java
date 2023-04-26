package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleDisabledWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/hp/Desktop/Selenium%20Data/webelement/disabledelement.html");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		jse.executeScript("document.getElementById('i1').value='Supriya' ");
		
	}

}
