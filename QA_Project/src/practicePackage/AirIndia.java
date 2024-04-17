package practicePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AirIndia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver browserObject = new ChromeDriver();
		browserObject.get("https://www.airindia.com/");
	
//WebElement staticdropdown = browserObject.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span/span"));
//		Select dropdown = new Select(staticdropdown );
//		dropdown.selectByIndex(0);
//	
//		dropdown.selectByIndex(1);
//	
	
		
	}

}
