package handlingWebBasedPoPup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPoPup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	     options.addArguments("--disable-notifications");
	     Thread.sleep(2000);
	     WebDriver driver=new ChromeDriver(options);
	
		 driver.manage().window().maximize();
		
		 driver.get("https://www.irctc.co.in/nget/train-search");
		
	}

}
