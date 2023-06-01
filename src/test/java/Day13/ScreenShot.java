package Day13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		
		// ScreenShots 
		
		// To provide an evidence that we found a bug also to confirm the script is successfully runned 
		
		TakesScreenshot s = (TakesScreenshot)driver ;
		
		// Source - where we need to take screen shot 
		
		// Destination - where our screenshot to be saved
		
		File source = s.getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\target\\TC-01.png");

		// How to take screen shot 
		
		
		try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
