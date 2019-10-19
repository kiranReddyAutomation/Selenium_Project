package interview_Practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Using "TestListenerAdapter" Class to take Screenshot of Failed TestCase
@Listeners(interview_Practice.CustomListener.class)
public class Screenshot1 {
	
	public static WebDriver driver;

    @BeforeClass
    public void setUpBrowser() {
    	
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		//Create Chrome driver's instance
		driver = new ChromeDriver();
	
	    driver.manage().window().maximize();
				
	//Set implicit wait of 10 seconds
	//This is required for managing waits in selenium webdriver
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.sakshi.com/");
	
    }
    
    @Test
    public void testMethodOne() {
    	
    	WebElement elm = driver.findElement(By.xpath("//div[@class='views-row views-row-3 views-row-odd dottedborder']//a[@href='/news/movies/child-artist-chakri-media-interaction-about-maharshi-1188155']"));
    	
    	elm.click();
    }
    
    @AfterClass
	public void quitTheBrowser() {
		
		driver.quit();
	}

}
