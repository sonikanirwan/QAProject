package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
       		 ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[7]")).click();
	       
	        browserObject.findElement(By.xpath("//input[@value ='car']")).click();
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[9]")).click();
	        
		
		//browserObject.close();
		
		
		
		
		
		
		
	}

}
