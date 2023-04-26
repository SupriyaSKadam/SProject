package operationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/hp/Desktop/Selenium%20Data/webelement/SingleSelectDropdown.html");
		
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		Select sel = new Select(dropDownElement);
		
		System.out.println(sel.isMultiple());
		
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/hp/Desktop/Selenium%20Data/webelement/multiselectDropdown.html");
		
		WebElement dropDownElement1 = driver.findElement(By.id("cars"));
		Select sel1 = new Select(dropDownElement1);
		
		System.out.println(sel1.isMultiple());
	}

}
