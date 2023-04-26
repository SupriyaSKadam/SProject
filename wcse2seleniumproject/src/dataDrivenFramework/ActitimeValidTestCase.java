package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActitimeValidTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://127.0.0.1/login.do;jsessionid=1frvdd60cvg05");
	
	Flib flib = new Flib();
	String data = flib.readExcelData("./data/ActitimeTestData.xlsx","ValidCreds", 1, 0);
	String data1 = flib.readExcelData("./data/ActitimeTestData.xlsx","ValidCreds", 1, 1);
	
	driver.findElement(By.name("username")).sendKeys(data);
	driver.findElement(By.name("pwd")).sendKeys(data1);
	driver.findElement(By.id("loginButton")).click();
	
	
  }
}