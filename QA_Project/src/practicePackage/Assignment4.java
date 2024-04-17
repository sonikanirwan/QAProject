package practicePackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment4 {
	WebDriver browserObject ;
	 @BeforeTest
	    public void beforeTest () {
		 browserObject  = new ChromeDriver();
		 browserObject .manage().window().maximize();
		 browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 browserObject.get("https://www.itlearn360.com/");
		 
	 }
	
	@Test(priority =1)
	    public void itlearn() throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 //browserObject  = new ChromeDriver();
		 //browserObject .manage().window().maximize();
		 //browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 //browserObject.get("https://www.itlearn360.com/");
	       WebElement login = browserObject.findElement(By.id("loginlabel"));
	       login.click();
	       WebElement username = browserObject.findElement(By.id("user_login"));
	       WebElement password = browserObject.findElement(By.id("user_pass"));
	       WebElement submitBtn = browserObject.findElement(By.name("wp-submit"));
	       username.sendKeys("Sonika11");
	       password.sendKeys("Sonika12345*");
	       submitBtn.click();
	       Thread.sleep(2000);

}
	 @Test(priority = 3)
	    public void assertHomePage() throws InterruptedException {
	       System.out.println("--using Assert - Checking Homepage Text else, this test will fail");
	        String expectedTextFromPage="Dashboard";
	        String actualTextFromHomePage= browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).getText();
	        assertEquals(actualTextFromHomePage, expectedTextFromPage);
	        browserObject.findElement(By.linkText("Dashboard")).click();
	        Thread.sleep(2000);
	 }
	 @Test (priority = 2)
	 public void Search () {
		 browserObject.findElement(By.name("search_course")).sendKeys("Software Testing");
		 browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();
		 
	 }
}