package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialMediaNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	      ChromeDriver  browserObject = new ChromeDriver();
		// 3. Open the web page https://www.facebook.com/
	        browserObject.get("https://www.itlearn360.com/");
	        System.out.println("This is "  +browserObject.getTitle()+  " website");
	        System.out.println("Url is "  +browserObject.getCurrentUrl());
	        
	        browserObject.findElement(By.className("fa-facebook")).click();
	        browserObject.navigate().back();
	        
	        browserObject.findElement(By.className("fa-twitter")).click();
	        browserObject.navigate().back();
	        
	        browserObject.findElement(By.className("fa-instagram")).click();
	        browserObject.navigate().back();
	        

	        browserObject.findElement(By.className("fa-youtube")).click();
	        browserObject.navigate().back();
	        
	        browserObject.findElement(By.className("fa-linkedin")).click();
	        browserObject.navigate().back();
	        
	        browserObject.close();
	        
	}

}
