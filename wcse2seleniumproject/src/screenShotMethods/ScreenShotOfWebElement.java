package screenShotMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement {
	
	public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get("https://www.selenium.dev/");
	    
	    WebElement seleniumIDE = driver.findElement(By.xpath("//h4[text()='Selenium IDE']/ancestor::div[@class='card-body']"));
	    
	    File src = seleniumIDE.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./ScreenShots/webElementss.png");
	    
	    Files.copy(src, dest);
	}

}
