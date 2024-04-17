package practicePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlightBooking {
	WebDriver driver ;
	
	@BeforeTest
	    public void beforeTest() {
		
	    System.out.println("--@beforeTest, set the browser, maximise the window");
			
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");driver = new ChromeDriver();
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		  }
 @Test
 public void Booking () {
 
 System.out.println("Booking the flight");
 driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[3]")).click();
 WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
 Select dropdown = new Select (staticDropdown);
 dropdown.selectByIndex(3);
//System.out.println( dropdown.getFirstSelectedOption().getText());
 
 
 
 }
 //@AfterTest
 //public void afterTest() {
     //System.out.println("--@afterTest, closing the browser window");
	// 15. Close the web browser.   
 //  driver.close();
 //}
     
    }