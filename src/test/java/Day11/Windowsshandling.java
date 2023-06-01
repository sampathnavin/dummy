package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsshandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//  Windows handling 
		
		//  Handling the new tabs/pages which is opened by the browser
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		//getWindowHandle(); will retrive current window 
		
		String parentwind = driver.getWindowHandle();
		
		
		
		
		WebElement facebook = driver.findElement(By.xpath("//a[text()= 'Facebook']"));
		facebook.click();
		
		
		
		// Get windows handles will retriev all window 
		
		// Most important interview question wht is the return type od get window handles 
		
		Set<String> allwindows = driver.getWindowHandles();
		
		// List is used to get the index from the set as set cannot get the index
		
		List<String> setofwindows = new ArrayList<String>(allwindows);
		String newwindow = setofwindows.get(1);
		driver.switchTo().window(newwindow);
		driver.close();
		
		driver.switchTo().window(parentwind);
		
		
		
			
		
	}

}
