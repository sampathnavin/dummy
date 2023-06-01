package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLinkText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		String logintitle = driver.getCurrentUrl();
		
		System.out.println(logintitle);
		
		// Locators - whch will help u  to identify the web elements 
		 //  USING BY CLASS WE ARE GOING TO CALL LOCATORS 
		// ID 
		// NAME 
		// CLASS
		// LINK TEXT 
		// PARTIAL LINK TEXT 
		// CSS SELCTORS 
		// XPATH 
		
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		// Link Text  -   in //a href tag name u can find ur text in between
		// > symbo and < symbol 
		
		// Partial Link Text  -  half of ur link text 
		
		String homeurl = driver.getCurrentUrl();
		
		System.out.println(homeurl);
		
		
		if(logintitle.equals(homeurl))
		{
			System.out.println("LoginFailed");
		}
		else
		{
			System.out.println("SucessfullLogin");
		}
		
		// Link Text
		 // WebElement twiter =	driver.findElement(By.linkText("Twitter"));
		// twiter.click();
		
		// Partial Link Text 
		
		WebElement facebook = driver.findElement(By.partialLinkText("Face"));
		facebook.click();
		
		
		
		
		
		
		
		
		

	}

}
