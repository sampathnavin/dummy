package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static void main(String[] args) {
		
		// Selenium : Selenium is a jar file which is used to test web applications which is 
		// starting as https:// watever browsers we can use
		
		// To reduce the continous manual efforts automatio is being introduced 
		// In automation human can miss any error but ur tool will not miss any error 
		
		// Webdriver -- In selenium Webdriver is the important core of selenum automation 
		
		//  Webdriver - Webdriver is a Interface 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//  to launch a webdriver we have use the below method
		
		driver.get("https://www.facebook.com/login.php");
		
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		driver.quit();
		

	}

}
