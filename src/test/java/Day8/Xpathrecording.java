package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathrecording {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//  XPATH - ONE OF THE LOCATORS METHOD WHICH IS IN BY CLASS 
		
		// TWO TYPES OF XPATH
		// ABSOLUTE XPATH 
		// -- STARTS WITH / - IT WILL FIND THE ELEMENT ONE BY ONE BY TRAVELING FROM ROOT / BODY / HTML IN DOM STRUCTURE
		// /html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input
		
		
		// RELATIVE XPATH
		
		  ///    //input[contains(@data-test , 'username')]
		
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@data-test , 'username')]"));
		
		
	}

}
