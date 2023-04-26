package assigenment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePohaList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.google.com/");
	    WebElement googleSB = driver.switchTo().activeElement();
	    googleSB.sendKeys("Poha"); 
	    Thread.sleep(2000);

	    List<WebElement> poha = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	    Thread.sleep(2000);
	    for(int i=1;i<poha.size();i++)
	    {
	    	WebElement opt = poha.get(i);
			String pohaitems = opt.getText();
			System.out.print(pohaitems);
			System.err.println();
		}
	   
	}

}
