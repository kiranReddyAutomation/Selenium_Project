package interview_Practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

////Using "ITestListener" Interface to take Screenshot of Failed TestCase
@Listeners(interview_Practice.TestListeners.class)
public class Screenshot {
	
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
    public void testMethod1() {
    	
    	WebElement elm = driver.findElement(By.xpath("//div[@class='views-row views-row-3 views-row-odd dottedborder']//a[@href='/news/movies/child-artist-chakri-media-interaction-about-maharshi-1188155']"));
    	
    	elm.click();
    }
    
    @Test
    public void testMethod2() {
    	
    	WebElement elm1 = driver.findElement(By.xpath("//li[@class='flex-active-slide']"));
    	
    	elm1.click();
    }
	
	@AfterClass
	public void quitTheBrowser() {
		
		driver.quit();
	}
}
