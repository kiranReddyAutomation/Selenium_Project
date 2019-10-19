package practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EventFiringWebDriverExample {
	
public static WebDriver driver;
	
	@BeforeClass
    public void setUpBrowser() {
    	
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Create Chrome driver's instance
		driver = new ChromeDriver();
	
	    driver.manage().window().maximize();
				
	/*Set implicit wait of 10 seconds
	This is required for managing waits in selenium webdriver*/
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.sakshi.com/");
	
    }
	
	@Test
    public void testMethod() throws IOException {
		
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		
        File src = edriver.getScreenshotAs(OutputType.FILE);
        
        FileHandler.copy(src, new File("./Screenshots/Name.png"));
        
        System.out.println("Screenshot has Taken");
	}

	@AfterClass
	public void quitTheBrowser() {
		
		driver.quit();
	}
}