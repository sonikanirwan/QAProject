package practicePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMDemo {
	WebDriver browserObject;
	 @BeforeTest
	  public void beforeTest () {
	  System.out.println("--@beforeTest, set the browser, maximise the window");
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");      
	  browserObject = new ChromeDriver();

	       browserObject.manage().window().maximize();
	       browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	   
	 }
	 
@Test(priority =2)

public void OrangeLogin() {


	System.out.println("Performing Login and wait for 2 seconds");
	browserObject.get("https://opensource-demo.orangehrmlive.com/");
	browserObject.findElement(By.name("username")).sendKeys("Admin");
	browserObject.findElement(By.name("password")).sendKeys("admin123");
	browserObject.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	
}
@Test (priority =1)
public void loginfail() {
	browserObject.get("https://opensource-demo.orangehrmlive.com/");
	browserObject.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	System.out.println("Login should fail");
}

@Test (priority =3)
public void sidebarcheck() {
	browserObject.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button/i")).click();
	System.out.println("Side taskbar should expand ");
	browserObject.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button/i")).click();
	System.out.println("Side taskbar should clase");
}



}
