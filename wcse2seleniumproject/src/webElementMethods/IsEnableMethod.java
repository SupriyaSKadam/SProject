package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		WebElement loginButton1 = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		System.out.println(loginButton1.isEnabled());
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("qwertyuiop");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("12345#");
		WebElement loginButton2 = driver.findElement(By.xpath("//button[.='Log in']"));
		System.out.println(loginButton2.isEnabled());
	}

}
