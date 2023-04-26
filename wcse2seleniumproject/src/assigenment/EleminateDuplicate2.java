package assigenment;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EleminateDuplicate2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/hp/Desktop/Selenium%20Data/webelement/multiselectDropdown.html");
		WebElement dropDown = driver.findElement(By.id("cars"));
		
		Select sel = new Select(dropDown);
        
		
        LinkedHashSet<String> set=new LinkedHashSet<String>(); //To achieve insertion 
                                                               // order of SET
        List<WebElement> allops = sel.getOptions(); //To read the List<WebElements>
        
        set.addAll(set);
        
        for(int i=0;i<allops.size();i++)
		{
			WebElement opt = allops.get(i); 
			String text = opt.getText();
		    set.add(text);                  //We add the text to SET so that duplicates
	                                        //Duplicates wont't be accepted
		}
        for(String value1:set)
        {   
        	
        	System.out.println(value1);
        }
        
       
	}

}
