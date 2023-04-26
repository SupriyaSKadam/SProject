package screenShotMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get("https://www.meesho.com/");
	    
	    //Way5:We need to do ExpliciteTypeCasting into TakeScreenshot interface
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./ScreenShots/ssWay5.png");
	    Files.copy(src, dest);
	}

}
