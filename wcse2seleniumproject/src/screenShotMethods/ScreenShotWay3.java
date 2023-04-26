package screenShotMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	   //Way3: Up-cast Browser Specific Class of RemoteWebDriver Class
		
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.swiggy.com/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssWay3.jpg");
	
		Files.copy(src, dest);

    }
}