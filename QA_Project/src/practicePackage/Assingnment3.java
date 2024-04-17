package practicePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assingnment3 {
	WebDriver browserObject ;
	 @Test
	    public void Search() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 browserObject  = new ChromeDriver();
		 browserObject .manage().window().maximize();
		 browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 browserObject.get("https://www.itlearn360.com/");
	       WebElement login = browserObject.findElement(By.id("loginlabel"));
	       login.click();
	       WebElement username = browserObject.findElement(By.id("user_login"));
	       WebElement password = browserObject.findElement(By.id("user_pass"));
	       WebElement submitBtn = browserObject.findElement(By.name("wp-submit"));
	       username.sendKeys("Sonika11");
	       password.sendKeys("Sonika12345*");
	       submitBtn.click();
	       Thread.sleep(3000);
	       browserObject.findElement(By.name("search_course")).sendKeys("software testing");
			browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();    
	    
	        Thread.sleep(2000);
	    }

}
