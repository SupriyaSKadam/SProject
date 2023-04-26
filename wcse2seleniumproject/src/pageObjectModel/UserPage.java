package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	@FindBy(xpath="//input[@value='Create New User']") private WebElement CreateNewUserButton;
	@FindBy(xpath="//input[@name='username']")private WebElement UsnTB;
	@FindBy(xpath="//input[@name='passwordText']")private WebElement PassTB;
	@FindBy(xpath="//input[@name='passwordTextRetype']")private WebElement RetypePassTB;
	@FindBy(xpath="//input[@name='firstName']")private WebElement FirstNTB;
	@FindBy(xpath="//input[@name='lastName']")private WebElement LastNTB;
	@FindBy(xpath="//input[@type='submit']")private WebElement CreateUserButton;
	@FindBy(xpath="//input[@type='button' and @value='Clean Up Demo Data' ]")private WebElement CancelButton;
	
	
	//initialization
	
	public UserPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}


	//getter methods
	
	public WebElement getCreateNewUserButton() {
		return CreateNewUserButton;
	}


	public WebElement getUsnTB() {
		return UsnTB;
	}


	public WebElement getPassTB() {
		return PassTB;
	}


	public WebElement getRetypePassTB() {
		return RetypePassTB;
	}


	public WebElement getFirstNTB() {
		return FirstNTB;
	}


	public WebElement getLastNTB() {
		return LastNTB;
	}


	public WebElement getCreateUserButton() {
		return CreateUserButton;
	}


	public WebElement getCancelButton() {
		return CancelButton;
	}
	
	//Operational Methods
	public void createNewUser()
	{
		CreateNewUserButton.click();
	}
	
	public void firstValidUser(String usn,String pass,String fName,String lName)
	{
		UsnTB.sendKeys(usn);
		PassTB.sendKeys(pass);
		RetypePassTB.sendKeys(pass);
		FirstNTB.sendKeys(fName);
		LastNTB.sendKeys(lName);
		CreateUserButton.click();
		//CancelButton.click();
	}
	
}
