package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usn = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("password"));
		usn.sendKeys("Admin");
		pass.sendKeys("admin123");
		WebElement loginB = driver.findElement(By.xpath("//button[.=' Login ']"));
		loginB.submit();
	}

}
