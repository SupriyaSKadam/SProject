package assigenment;

import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EleminateDuplicate1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/hp/Desktop/Selenium%20Data/webelement/multiselectDropdown.html");
		WebElement dropDown = driver.findElement(By.id("cars"));
		
		Select sel = new Select(dropDown);
		
		HashSet<String> hs = new HashSet<String>(); //To get the List<WebElements>
		
		List<WebElement> allops = sel.getOptions(); //To read the List<WebElements>
		
		for(int i=0;i<allops.size();i++)
		{
			WebElement opt = allops.get(i); 
			String text = opt.getText();    
			hs.add(text);                   //We add the text to SET so that duplicates
			                                //won't be accepted		                               
	    }
		
        for(String value:hs) 
        {
        	System.out.println(value);      //To Read the SET
        } 
        //but in this case insertion order won't be maintained 
     }
}
