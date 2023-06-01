package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCLass {

	public static void main(String[] args) {
		
		// Select Class - Is used for handling drop down web element 
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		
		WebElement password = driver.findElement(By.cssSelector("input[data-test='password']"));
		
		
		WebElement login = driver.findElement(By.cssSelector("input[value='Login']"));
		
		username.sendKeys("standard_user");
		
		password.sendKeys("secret_sauce");
		
		login.click();
		
		
		WebElement drop = driver.findElement(By.cssSelector("select[data-test='product_sort_container']"));
		
		// Select Class is used only for handling drop down web element 
		
		Select s = new Select(drop);
		
		List<WebElement> p = s.getOptions();
		
		for(WebElement q : p)
		{
			System.out.println(q.getText());
		}
		
		s.selectByIndex(1);
		
		
		// s.selectByValue("hilo");
		  
		 // s.selectByVisibleText("Price (high to low)");
		
		
		
		

	}

}
