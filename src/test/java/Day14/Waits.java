package Day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io//jQuery-contextMenu//demo.html");
		
		// Waits - Are two types
		
		// Implicit Wait - Acts as Thread.Sleep, It will wait for 10 Seconds
		// 20 Seconds It wil for 20 seconds 
		
		// Explicit wait - Will be applicable for a webelement 
	
		// If a user is giving 30 seconds to wait for a webelement 
		
		// If webelement is loaded in 10 seconds it will skip the next 20 seconds and starts executing the next line of code
		
		
		// Declaring Implicit waits 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))	;
		
		// Declaring Explicit waits 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Actions a  = new Actions(driver);
		
		WebElement right = driver.findElement(By.xpath("//span[(text() = 'right click me')]"));
		
		wait.until(ExpectedConditions.visibilityOf(right));
		
		a.contextClick(right).build().perform();
		
		List<WebElement> ul = driver.findElements(By.xpath("//ul[contains(@class, 'context-menu-list context-menu-root')]/li/span"));
		
		System.out.println(ul.size());		
		
		for(WebElement w : ul)
		{
			System.out.println(w.getText());
			if(w.getText().equals("Copy"))
			{
			w.click();
			break ;
			}
		}
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
	}

}
