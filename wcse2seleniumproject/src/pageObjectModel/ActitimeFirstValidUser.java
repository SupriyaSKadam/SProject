package pageObjectModel;

import java.io.IOException;

public class ActitimeFirstValidUser extends BaseTest {
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		HomePage hp = new HomePage(driver);
		hp.clickOnUsersTab();
		UserPage up = new UserPage(driver);
		up.createNewUser();
		String usn1 = flib.readExcelData(EXCEL_PATH, "UserCreds", 1, 0);
		String pass1 = flib.readExcelData(EXCEL_PATH, "UserCreds", 1, 1);
		String fName = flib.readExcelData(EXCEL_PATH, "UserCreds", 1, 2);
		String lName = flib.readExcelData(EXCEL_PATH, "UserCreds", 1, 3);
		
		up.firstValidUser(usn1, pass1, fName, lName);
	}

}
