package keywordDrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeInvalidTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		int rc = flib.rowCount(EXCEL_PATH,"InvalidCreds");
		
		for(int i=1;i<=rc;i++)
		
		{
			
			String usn = flib.readExcelData(EXCEL_PATH,"InvalidCreds", i, 0);
			String pass = flib.readExcelData(EXCEL_PATH, "InvalidCreds", i, 1);
		    
			driver.findElement(By.name("username")).sendKeys(usn);
		    driver.findElement(By.name("pwd")).sendKeys(pass);
		    driver.findElement(By.id("loginButton")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("username")).clear();
		}
	    bt.tearDown();
	}
	
		
		
}
