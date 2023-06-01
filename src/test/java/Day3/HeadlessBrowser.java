package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");

		// HeadlessBrowser - Without Browser UI 
		
		// How can we initiate Headless Browser 
		
		
		ChromeOptions co = new ChromeOptions();
		
		// To set headless 
		
		co.addArguments("--headless=new");
		
		// We have to overload  chrome option in chromedriver class
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//  To get the title there is a method 
		
		String logintitle = driver.getTitle();
		
		System.out.println(logintitle);
		
		

	}

}
