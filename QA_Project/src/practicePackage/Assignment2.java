package practicePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment2 {
	WebDriver browserObject ;
	// 4. Use @Test to generate the test report
	 @Test
	    public void Login() throws InterruptedException {
	        System.out.println("Performing Login and wait for 2 seconds");
		   browserObject .get("https://www.itlearn360.com/");
	        WebElement login = browserObject.findElement(By.id("loginlabel"));
	        login.click();
	        WebElement username = browserObject .findElement(By.id("user_login"));
	        WebElement password = browserObject .findElement(By.id("user_pass"));
		    WebElement submitBtn = browserObject .findElement(By.name("wp-submit"));
		    username.sendKeys("Sonika11");
	        password.sendKeys("Sonika12345*");
		    submitBtn.click();
	         Thread.sleep(2000);
	    }
	 
	 @Test
	    public void Search() throws InterruptedException {
	 browserObject .get("https://www.itlearn360.com/");
	       WebElement login = browserObject.findElement(By.id("loginlabel"));
	       login.click();
	       WebElement username = browserObject .findElement(By.id("user_login"));
	       WebElement password = browserObject .findElement(By.id("user_pass"));
	       WebElement submitBtn = browserObject .findElement(By.name("wp-submit"));
	       username.sendKeys("Sonika11");
	       password.sendKeys("Sonika12345*");
	       submitBtn.click();
	       Thread.sleep(5000);
	       browserObject.findElement(By.name("search_course")).sendKeys("software testing");
			browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();    
	    
	        Thread.sleep(2000);
	    }
	 
	 
	@BeforeTest
    public void beforeTest() {
        System.out.println("--@beforeTest, set the browser, maximise the window");
	 // 2. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize Webdriver object through ChromeDriver class.
        browserObject  = new ChromeDriver();
	 browserObject .manage().window().maximize();
	 browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
	//19. @AfterTest is used to excute the test case after the test is exceuted
	// @AfterTest
	  //  public void afterTest() {
	        //System.out.println("--@afterTest, closing the browser window");
		// 20.    Close the web browser.
	      //  browserObject .close();
	    //}



}