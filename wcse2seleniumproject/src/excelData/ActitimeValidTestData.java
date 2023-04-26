package excelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActitimeValidTestData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=1frvdd60cvg05");
		
		FileInputStream fis = new FileInputStream("./data/ActitimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("ValidCreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		
		FileInputStream fis2 = new FileInputStream("./data/ActitimeTestData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wb2.getSheet("ValidCreds");
		Row row2 = sheet2.getRow(1);
		Cell cell2 = row2.getCell(1);
		String data2 = cell2.getStringCellValue();
		driver.findElement(By.name("username")).sendKeys(data);
		driver.findElement(By.name("pwd")).sendKeys(data2);
		driver.findElement(By.id("loginButton")).click();
		
	}
}
