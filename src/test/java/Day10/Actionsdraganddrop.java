package Day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdraganddrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions a = new Actions(driver);
		List<WebElement> drag = driver.findElements(By.xpath("//div[@id = 'dropContent']/div"));
		
		List<WebElement> drop = driver.findElements(By.xpath("//div[@id = 'countries']/div"));
		
		System.out.println(drag.size());
		System.out.println(drop.size());
		
		for(WebElement e : drag)
		{
			if(e.getText().endsWith("Stockholm"))
			{
				System.out.println(e.getText());
				for(WebElement r : drop)
				{
					if(r.getText().equals("Italy"))
					{
						System.out.println(r.getText());
						a.dragAndDrop(e, r).build().perform();
						break;
					}
					
				}
				
			}
			
			
		}
		
		
		
	}

}
