package Day13;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboClass {

	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		Robot r = new Robot();
		
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

		Rectangle rr1 = new Rectangle(screensize);
		
		BufferedImage br = r.createScreenCapture(rr1);
		
		File Destination = new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch3\\target\\robo.png");
		
		
		try {
			ImageIO.write(br, "png", Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();

	}

}
