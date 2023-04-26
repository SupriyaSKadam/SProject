package handlingWindowBasedPoPup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPoPup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=121um4ijte0es");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
		WebElement target = driver.findElement(By.partialLinkText("Logo & Color Scheme"));

		Actions act = new Actions(driver);
		// mouserHover Action
		act.moveToElement(target).perform();
		target.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		WebElement target2 = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		//DoubleClick Action
		act.doubleClick(target2).perform();
	}
}
