package webdriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindowHandlesMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com/");
		
		String parentHandle = driver.getWindowHandle();
		System.out.println("This is address of Parent Window" +":"+ parentHandle);
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> allHandles = driver.getWindowHandles();
        for(String wh:allHandles)
        {
        	System.out.println("This is address of all windows "+":"+ wh);
        }
	}
}
