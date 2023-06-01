package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		// Actions are the inbuild class wich will be given by selenium 
		
		Actions act = new Actions(driver);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		
		// For Right Click we do have a method called contextclick in acions 
		
		act.contextClick(rightclick).build().perform();
		
	List<WebElement> rightclickoptions = driver.findElements(By.xpath("//ul[contains(@class, 'context-menu-list context-menu-root')]/li/span"));		
	
	
	for(WebElement e : rightclickoptions )
	{
		System.out.println(e.getText());
		
		if(e.getText().equals("Copy"))
		{
			e.click();
			break;
		}
	}
	
	System.out.println(driver.switchTo().alert().getText());
	
	driver.switchTo().alert().accept();
	
		
		
		
	}

}
