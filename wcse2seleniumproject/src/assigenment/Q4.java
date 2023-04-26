package assigenment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Q4 {
    public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//close only child window
	String parentHandle = driver.getWindowHandle();
	Set<String> allhandle = driver.getWindowHandles();
	for(String wh:allhandle)
	{
		if(!parentHandle.equals(wh))
		{
		    driver.switchTo().window(wh).close();
		}
		
		
	}
 }	
}
