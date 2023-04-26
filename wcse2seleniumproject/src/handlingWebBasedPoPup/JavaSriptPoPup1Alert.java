package handlingWebBasedPoPup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaSriptPoPup1Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        driver.get("file:///C:/Users/hp/Desktop/Selenium%20Data/webelement/AlertPoPup.html");
		
        //To Generate The Alert PoPup
        driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		
		//To Handle The Alert PoPup
		Alert al = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		//To Accept The Alert PoPup
		//al.accept();
		
		//To Dismiss The Alert PoPup
		//al.dismiss();
		
		//To Get Text Of The Alert PoPup
		//System.out.println(al.getText());
		
	}
}
