package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
   
	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.err.println("Which Browser do u want?");
		String browserValue = sc.next();
		if (browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserValue.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		else
		{
			System.err.println("Invalid browsername");
		}
	}
	
	
}
