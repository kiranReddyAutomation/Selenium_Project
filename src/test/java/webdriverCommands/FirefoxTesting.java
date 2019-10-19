package webdriverCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class FirefoxTesting {

	public WebDriver driver;
	
	@Test
	public void startBrowser() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.sakshi.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}	
	
}
