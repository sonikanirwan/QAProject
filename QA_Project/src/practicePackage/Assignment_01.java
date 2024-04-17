package practicePackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_01 {
	WebDriver browserObject;

	@BeforeTest
    public void beforeTest () {
	
      //  System.setProperty("webdriver.edge.driver", "C:\\Program Files\\msedgedriver.exe");
		//browserObject = new EdgeDriver ();
		System.out.println("--@beforeTest, set the browser, maximise the window and implicity wait is 10 seconds");
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");      
		  browserObject = new ChromeDriver();

		  browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		browserObject.manage().window().maximize();

}
   @Test (priority =1)	
   public void verifyLogin () throws InterruptedException {
	      System.out.println("Verify Login and wait for 2 seconds");
		
	      browserObject.get("http://demo.itlearn360.com/");
	      browserObject.findElement(By.id("loginlabel")).click();
	   browserObject.findElement(By.id("user_login")).sendKeys("Demo12");
	      browserObject.findElement(By.name("pwd")).sendKeys("Test123456$");
	      browserObject.findElement(By.id("wp-submit")).click();
	Thread.sleep(2000);
   }
   @Test (priority =2)	
	 public void Search () throws InterruptedException {
		 browserObject.findElement(By.name("search_course")).sendKeys("Software Testing");
		 browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();
		 Thread.sleep(2000);
	 }
   @Test (priority = 3)	
   public void assertHomePage() throws InterruptedException {
      System.out.println("--using Assert - Checking Homepage Text else, this test will fail");
       String expectedTextFromPage="Dashboard";
       String actualTextFromHomePage= browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).getText();
       assertEquals(actualTextFromHomePage, expectedTextFromPage);
       browserObject.findElement(By.linkText("Dashboard")).click();
       Thread.sleep(2000);                                                                                                                               
   }
   @Test (priority = 4)	
   public void Subscribe () throws InterruptedException {
	   browserObject.findElement(By.linkText("Offered Academies")).click();
	  
	   JavascriptExecutor js = (JavascriptExecutor) browserObject;

		js.executeScript("window.scrollBy(0,750)", "");

		

		browserObject.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button")).click();
	 Thread.sleep(2000);
   }
   @Test (priority = 5)	
   public void Payment () throws InterruptedException {
	   browserObject.findElement(By.xpath("//*[@id=\"learn-press-payment\"]/ul/li/label")).click();
	   Thread.sleep(2000);
	   JavascriptExecutor js = (JavascriptExecutor) browserObject;

		js.executeScript("window.scrollBy(0,750)", "");
		browserObject.findElement(By.xpath("//*[@id=\"learn-press-checkout-place-order\"]")).click();
		Thread.sleep(2000);
		  WebElement email =   browserObject.findElement(By.name("spemail"));
	       email.clear();
	      email.sendKeys("abcd123@gmail.com");
	     WebElement fm = browserObject.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe"));
	    
	     browserObject.switchTo().frame(fm);
		browserObject.findElement(By.name("cardnumber")).sendKeys("1122 3344 5566 7788");
		browserObject.findElement(By.name("exp-date")).sendKeys("06/25");
   browserObject.findElement(By.name("cvc")).sendKeys("456");
   //browserObject.findElement(By.id("payment-button")).click();
  
   }
   
   @AfterTest
   public void afterTest () {
	   System.out.println("--@afterTest, closing the browser window");
	   browserObject.close();
   }
}
	    
	   
	   
	   
	   
	   
	   
	   
	   
   
