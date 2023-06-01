package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		
		// Webelement - Any thing that can be accesibe in web applcation are said to be as Welement
	
		//  Webelements - Collections of webelemnt are said to be webelments 
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//  To get the title there is a method 
		
		String logintitle = driver.getTitle();
		
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
		
		/*
		 * String hometitle = driver.getTitle();
		 * 
		 * System.out.println(hometitle);
		 */
		
	
	}

}
