package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ActitimeInvalidTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,"InvalidCreds");
		for(int i=1;i<=rc;i++)
		{
			LoginPage lp = new LoginPage(driver);
			lp.invalidLogin(flib.readExcelData(EXCEL_PATH, "InvalidCreds", rc, 0),flib.readExcelData(EXCEL_PATH, "InvalidCreds", rc, 1));
		}
	    Thread.sleep(2000);
	    bt.tearDown();
	}
	
}
