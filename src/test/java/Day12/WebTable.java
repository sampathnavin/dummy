package Day12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		
		// TABLE 
		
		// TR - ROWS 
		
		// TH - COLOUMN HEADER 
		
		// TR - OVERALL ROWS
		
		// TD - ROWS DATAS
		
		WebElement table = driver.findElement(By.id("customers"));
		
		List<WebElement> rows = table.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(rows.size());
		
		List<WebElement> coloumn = table.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println(coloumn.size());
		
		
		List<WebElement> rd = table.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		System.out.println(rd.size());
		
		for(WebElement e : coloumn)
		{
			System.out.println(e.getText());
		}
		
		for(int i = 1 ; i <= coloumn.size() ; i++)
		{
			List<WebElement> thiteration = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th["+i+"]"));
			// System.out.println("The Headings are " + thiteration.getText());
			for(WebElement e2 : thiteration)
			{
				System.out.println(e2.getText());
			}
			List<WebElement> tditeration = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td["+i+"]"));
			for(WebElement e1 : tditeration)
			{
				System.out.println(e1.getText());
			}
			//System.out.println("The Row Datas are " + tditeration.getText());
			Thread.sleep(Duration.ofSeconds(3));
		}
		
		

	}

}
