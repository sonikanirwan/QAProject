package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		   ChromeDriver browserObject = new ChromeDriver();
		   browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
	browserObject.findElement(By.name("proceed")).click();
	  Alert alert = browserObject.switchTo().alert();
	  System.out.println(alert.getText());
	  Thread.sleep(6000);
	  alert.accept();
	 //browserObject.close();
	}

}
