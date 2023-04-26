package operationalMethods;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/hp/Desktop/Selenium%20Data/webelement/multiselectDropdown.html");
		WebElement dropDown = driver.findElement(By.id("cars"));
		
		Select sel = new Select(dropDown);
		
		for(int i=0;i<5;i++)
		{
			sel.selectByIndex(i);
		}
	    List<WebElement> opt = sel.getAllSelectedOptions();
	    
	    for(WebElement we:opt)
	    {
	    	String allOptions = we.getText();
	    	System.out.println(allOptions);
	    }
	}

}
