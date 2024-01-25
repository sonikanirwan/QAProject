package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			//ChromeDriver browserObject = new ChromeDriver();
			System.setProperty("webdriver.edge.driver", "C:\\Program Files\\msedgedriver.exe");
			EdgeDriver browserObject = new EdgeDriver();
			
			browserObject.get("https://www.amazon.com/");
			
	}

}
