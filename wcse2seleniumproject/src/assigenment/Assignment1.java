package assigenment;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
	    Dimension targetSize=new Dimension(300, 450);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(4000);
		Point targetPosition=new Point(300, 200);
		driver.manage().window().setPosition(targetPosition);
		
	}

}
