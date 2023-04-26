package assigenment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeShortsAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com/");
		
		
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Shorts");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		
		List<WebElement> options = driver.findElements(By.xpath("//span[@class='style-scope ytd-reel-item-renderer']"));
	    List<WebElement> shortsViews = driver.findElements(By.xpath("//span[@class='style-scope ytd-reel-item-renderer']/ancestor::a[@class='yt-simple-endpoint style-scope ytd-reel-item-renderer']/descendant::span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
		for(int i=1;i<=options.size();i++)
	    {
	    	String op = options.get(i).getText();
	    	for(int j=i;j<=i;j++)
	    	{
	    		String opt = shortsViews.get(j).getText();
	    		System.out.print(op+"-"+opt);
	    	}
	    	System.out.println();
	    	
	    }
	    
	}

}
