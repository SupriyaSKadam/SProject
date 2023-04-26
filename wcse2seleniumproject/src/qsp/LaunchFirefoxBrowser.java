package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.geckodriver","./drivers/geckodriver.exe");
		
		new FirefoxDriver();
	}

}
