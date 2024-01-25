package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
       		 ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("https://www.amazon.com/");
	       
	        List<WebElement> allLinks = browserObject.findElements(By.tagName("a"));
	        
	        int count = 0;
			for (WebElement link : allLinks) {
	            
	            System.out.println(link.getAttribute("href"));
	            count ++;
	            
	        }
	        
	        System.out.println("total number of links present: "+count);
	        
	        //browserObject.close();
	        
	    	
	}

}
