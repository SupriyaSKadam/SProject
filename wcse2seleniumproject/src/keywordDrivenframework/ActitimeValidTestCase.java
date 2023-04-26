package keywordDrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeValidTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		driver.findElement(By.name("username")).sendKeys(flib.readPropertydata(PROP_PATH, "username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertydata(PROP_PATH, "password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.tearDown();
	}

}
