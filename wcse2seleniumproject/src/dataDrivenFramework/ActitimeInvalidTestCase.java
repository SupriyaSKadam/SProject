package dataDrivenFramework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActitimeInvalidTestCase {

	public static void main(String[] args) throws FileNotFoundException, EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=1frvdd60cvg05");
		
		
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/ActitimeTestData.xlsx","InvalidCreds");
		for(int i=1;i<=rc;i++)
		{
		   String usn = flib.readExcelData("./data/ActitimeTestData.xlsx","InvalidCreds", i, 0);
		   String pwd = flib.readExcelData("./data/ActitimeTestData.xlsx", "InvalidCreds", i, 1);
		
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		
		}
		driver.close();
	}
}
