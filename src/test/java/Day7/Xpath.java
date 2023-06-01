package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//XPATH IS ONE OF THE LOCATORS METHODS WHICH WE FIND IN BY CLASS 
		
		
		//  TWO TYPES OF XPATH 
		
		// ABSOLUTE XPATH 
		
		// RELATIVE XPATH 
		
		
		//  ABSOLUTE - STARTING WITH / AND IT WILL START FROM HEAD 
		    // AND IT WIL TRAVERSE ONE BY ONE TO FIND ITS WEB ELEMENT 
		
		
		// EG : /html/body/div/div/div/div[1]/div[2]/div/span/select
		
		
		/// DISADVANTAGE : WHEN ANY NEW CHANGES HAPPEN IN DOM STRUTURE ABSOLUTE WILL MPT WORK 
		

		//  RELATIVE XPATH : CUTOMIZED XPATH AND IT WILL START FROM // 
		
		
		//  //TAGNAME[text() = 'LinkedIn']
		
		
	//  Using Contains
		
			//  //TAGNAME[CONTAINS(@ATTRIBUTE, 'VALUES')]
			
		WebElement usrname = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		usrname.sendKeys("");	
			
		
		
		//  Using Text 
		
		WebElement eg = driver.findElement(By.xpath("//div[text() = 'Sauce Labs Backpack']"));	
		
		
		
		
	}

}
