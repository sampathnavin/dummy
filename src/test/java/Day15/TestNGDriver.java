package Day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDriver 

{
	WebDriver driver ;
	
	@BeforeTest
	public void intilize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void login()
	{
		driver.get("https://www.saucedemo.com/");			
		WebElement un = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement pass = driver.findElement(By.cssSelector("input[data-test='password']"));
		WebElement log = driver.findElement(By.cssSelector("input[type='submit']"));
		un.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		log.click();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.close();
	}

}
