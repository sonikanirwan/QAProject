package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver browserObject = new ChromeDriver();
		//System.setProperty("webdriver.edge.driver", "C:\\Program Files\\msedgedriver.exe");
		//EdgeDriver browserObject = new EdgeDriver();
        //browserObject.get("https://www.walmart.com/");
		browserObject.get("https://www.itlearn360.com/");
		browserObject.manage().window().maximize();
	
		browserObject.findElement(By.name("search_course")).sendKeys("software testing");
		browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();
		// Alert alert = browserObject.switchTo().alert();
		 Thread.sleep(6000);
		  //alert.accept();
		browserObject.navigate().back();
		browserObject.findElement(By.xpath("//*[@id=\"menu-item-13318\"]/a/span")).click();
		browserObject.navigate().back();
		browserObject.findElement(By.xpath("//*[@id=\"blog\"]/div[1]/div[1]/div/div[2]/ul/a[1]/li")).click();
		System.out.println("google map is open");
		browserObject.navigate().back();
		//WebElement a = browserObject.findElement(By.linkText("BOOK DEMO"));
		//if (a.isDisplayed()) {
         //   System.out.println("BOOK DEMO link is diplayed usingLinkText");
    //   } 
		//else 
        //{
           // System.out.println("Unable to find BOOK DEMO");
		//}
		JavascriptExecutor js = (JavascriptExecutor) browserObject;
		js.executeScript("window.scrollBy(0,500)", "");
		browserObject.findElement(By.linkText("BOOK DEMO")).click();
	}	

}

