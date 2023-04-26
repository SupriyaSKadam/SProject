package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=u1hdwnm7iod3");
		WebElement usernameTB = driver.findElement(By.name("username"));
		usernameTB.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		//WebElement loginButton = driver.findElement(By.xpath("//a[.='Login']"));
	   
		Thread.sleep(4000);
		usernameTB.clear();
		password.clear();
	}

}
