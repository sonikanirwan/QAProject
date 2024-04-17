package practicePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_02 { 

	WebDriver browserObject;
	  @BeforeTest
	    public void beforeTest () {
	        System.out.println("--@beforeTest, set the browser, maximise the window");
		
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	        browserObject = new ChromeDriver();
		 browserObject.manage().window().maximize();
	    }
	  @Test (dataProvider = "dp")
	    public void Login(String email, String passWord, String msg) throws InterruptedException {
		  System.out.println("Login and wait for 2 seconds");
		  browserObject.get("http://ect.itlearn360.com/");
		  browserObject.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[2]/a")).click();
		  browserObject.findElement(By.id("email")).sendKeys("email");
		  browserObject.findElement(By.id("password")).sendKeys("passWord");
		  browserObject.findElement(By.id("customerloginForm")).click();
		  Thread.sleep(2000);
	  }

	  @DataProvider
		public Object[][] dp()
		{
			return new Object[][] {
		    	new Object[] { "demo@infotek-solutions.com", "Test1234$" ,"user can't login ,test passed "}, 
		       // new Object[] { "admin", "admnhhj","Wrong Credentials" },
		       // new Object[] { "admin@yourstore.com", "admin","Test Passed" }
		    };
		}

}
