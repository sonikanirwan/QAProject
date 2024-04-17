package practicePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Itlearn360 {
	WebDriver browserObject;
	// @BeforeTest
	 // public void beforeTest () {
	 // System.out.println("--@beforeTest, set the browser, maximise the window");
	  //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

	//  browserObject = new ChromeDriver();

	     // browserObject.manage().window().maximize();
	  //  }
	 @Test
	    public void Login()  {
	      System.out.println("Performing Login and wait for 2 seconds");
	     System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	  	 browserObject = new ChromeDriver();
		
	      browserObject.get("https://www.itlearn360.com/");
	      browserObject.findElement(By.id("loginlabel")).click();
	      browserObject.findElement(By.id("user_login")).sendKeys("Sonika11");
	      browserObject.findElement(By.id("user_pass")).sendKeys("Sonika12345*");
	      browserObject.findElement(By.id("wp-submit")).submit();	 
	 }

	 //@AfterTest
	    //public void afterTest() {
	       // System.out.println("--@afterTest, closing the browser window");
		  
	      //  browserObject.close();
	// }
		
	 
	 
}
