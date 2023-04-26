package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/?cp=76060516106_aff_HKtG81k*FmE&ranMID=41134&ranEAID=HKtG81k*FmE&ranSiteID=HKtG81k.FmE-i4zWBrs_wehKBam0Pf4rWQ");
		Thread.sleep(2000);
		
        WebElement nikeCheckBox = driver.findElement(By.className("checkbox"));
        nikeCheckBox.click();
        System.out.println(nikeCheckBox);
        
        Thread.sleep(2000);
        driver.navigate().to("http://127.0.0.1/login.do;jsessionid=74l537n6f6fga");
        WebElement usn = driver.findElement(By.name("username"));
        usn.sendKeys("Supriya");
        System.out.println(usn);
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.name("pwd"));
        password.sendKeys("1234#");
        System.out.println(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Login']")).click();
        Thread.sleep(2000);
        driver.quit();
        
        
	}

}
