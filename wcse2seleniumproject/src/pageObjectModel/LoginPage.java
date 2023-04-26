package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	
	@FindBy(xpath="//input[@name='username']")private WebElement usnTB;
	@FindBy(xpath="//input[@name='pwd']")private WebElement passTB;
	@FindBy(xpath="//a[@id='loginButton']")private WebElement loginB;
	@FindBy(xpath="//input[@name='remember']")private WebElement checkB;
   
	public LoginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }

   //getter methods
	
	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getLoginB() {
		return loginB;
	}

	public WebElement getCheckB() {
		return checkB;
	}
   
   
   
   //operational methods
   
   public void validLogin(String ValidUsn, String ValidPass)
   {
	   usnTB.sendKeys(ValidUsn);
	   passTB.sendKeys(ValidPass);
	   loginB.click();
   }
   
   public void invalidLogin(String InvalidUsn,String InvalidPass) throws InterruptedException
   {
	   usnTB.sendKeys(InvalidUsn);
	   passTB.sendKeys(InvalidPass);
	   loginB.click();
	   Thread.sleep(2000);
	   usnTB.clear();
   }


}

