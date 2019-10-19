package interview_Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;


public class Screenshot2 {
	
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
    public void testMethodA() {
    	
    	WebElement elm = driver.findElement(By.xpath("//div[@class='views-row views-row-3 views-row-odd dottedborder']//a[@href='/news/movies/child-artist-chakri-media-interaction-about-maharshi-1188155']"));
    	
    	elm.click();
    }
    
    @Test
    public void testMethodB() {
    	
    	WebElement elm1 = driver.findElement(By.xpath("//li[@class='flex-active-slide']"));
    	
    	elm1.click();
    }
	
	@AfterMethod
	public void screenshotMethod(ITestResult result) throws IOException {	
		
		if (result.getStatus() == ITestResult.FAILURE ){
			
        File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        FileHandler.copy(src, new File("./Screenshots/"+result.getName()+".png"));
        
        System.out.println("Screenshot has Taken");
        
		}
   }
	
	@AfterClass
	public void quitTheBrowser() {
		
		driver.quit();
	}

}
