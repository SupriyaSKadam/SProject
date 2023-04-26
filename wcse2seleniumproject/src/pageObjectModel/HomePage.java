package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutButton;
	@FindBy(xpath = "//select[@name='usersSelector.selectedUser']")
	private WebElement EnterTimeTrackTB;
	@FindBy(xpath = "//input[@id='SubmitTTButton']")
	private WebElement SaveLeaveTimeTB;
	@FindBy(xpath = "//div[.='Users']/following-sibling::img")
	private WebElement UsersTab;

	// to initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// getter and setter methods

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getEnterTimeTrackTB() {
		return EnterTimeTrackTB;
	}

	public WebElement getSaveLeaveTimeTB() {
		return SaveLeaveTimeTB;
	}

	public WebElement getUsersTab() {
		return UsersTab;
	}

	// operational methods

	public void logoutButton() {
		logoutButton.click();
	}
	public void clickOnUsersTab() {
		UsersTab.click();
	}

}
