package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		
		//to perform Mouse Action we have to create object of Actions class
		Actions act = new Actions(driver);
		
		//to perform Mouse Over Action 
		act.moveToElement(target).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Band']")).click();
		
		
		
	}

}
