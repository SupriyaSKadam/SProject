package assigenment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentNo9_synchro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://shoppersstack.com/");
		
		WebElement iphone= driver.findElement(By.xpath("//div[contains(@class,'MuiPaper-root MuiCard-')]/descendant::img[@alt='APPLE iPhone 14 Pro']"));
		iphone.click();
		
		driver.findElement(By.xpath("//input[contains(@id,'Check Delivery')]")).sendKeys("123456");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement check = driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiB')]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(check)).click();
		
	}

}
