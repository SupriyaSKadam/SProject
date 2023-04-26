package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangleMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev/");
		WebElement download = driver.findElement(By.xpath("//h1[@class='display-1']"));
		Rectangle loc = download.getRect();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
        System.out.println(xaxis+" "+yaxis);
        int height = loc.getHeight();
        int width = loc.getWidth();
        System.out.println(height+" "+width);
        
		
	}

}
