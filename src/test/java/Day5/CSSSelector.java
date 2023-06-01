package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		// CSS Selectors 
		
		//  tagname[attribute name = 'attribute value']
		
	WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		
	WebElement password = driver.findElement(By.cssSelector("input[data-test='password']"));
	
	
	WebElement login = driver.findElement(By.cssSelector("input[value='Login']"));
	
	username.sendKeys("standard_user");
	
	password.sendKeys("secret_sauce");
	
	login.click();
	
	
	}

}
