package practicePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class EcommerceWebsite {
	WebDriver browserObject;
	@BeforeTest
	 public void beforeTest () {
	  System.out.println("--@beforeTest, set the browser, maximise the window");
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

	  browserObject = new ChromeDriver();

	     browserObject.manage().window().maximize();
	     browserObject.get("http://ect.itlearn360.com/");
	   

}
}