package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=73639v4vrp0up");
		String loginpageActualTitle = driver.getTitle();
		if(loginpageActualTitle.equals("actiTIME - Login"))
		{
			System.out.println("Test Case is pass,Login page is verified");
		}
		else
		{
			System.out.println("Test case is failed,Login page is not verified");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String homepageActualTitle = driver.getTitle();
		if(homepageActualTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Test case is pass,Home page is verified");
		}
		else 
		{
			System.out.println("Test case is failed,Home page is not verified");
		}
		driver.quit();
		
	}

}
