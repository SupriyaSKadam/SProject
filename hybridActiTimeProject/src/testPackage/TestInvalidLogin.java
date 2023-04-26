package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;


public class TestInvalidLogin extends BaseTest {
	
	@Test 
	public void invalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "InvalidCreds");
		
		LoginPage lp = new LoginPage(driver);
		
		for(int i=1;i<=rc;i++)
		{
			lp.invalidLogin(flib.readExcelData(EXCEL_PATH, "InvalidCreds",i, 0),flib.readExcelData(EXCEL_PATH, "InvalidCreds", i,1));
			
		}
		
	}

}
