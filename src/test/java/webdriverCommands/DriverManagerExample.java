package webdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerExample {
	
	public WebDriver driver;
	
	@Test
	public void webdriverManager() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		/*WebDriverManager.firefoxdriver().setup();
		
		driver=new FirefoxDriver();*/
		
		/*WebDriverManager.iedriver().setup();
		
		driver=new InternetExplorerDriver();*/
		
		driver.get("https://www.sakshi.com/");
		
		driver.quit();
	}

}
