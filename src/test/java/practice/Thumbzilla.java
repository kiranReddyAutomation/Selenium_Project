package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Thumbzilla {
	
   public static WebDriver driver;
	
	@BeforeClass
    public void setUpBrowser() {
    	
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Create Chrome driver's instance
		driver = new ChromeDriver();
	
	    driver.manage().window().maximize();
				
	//Set implicit wait of 10 seconds
	//This is required for managing waits in selenium webdriver
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.thumbzilla.com/");
	
    }
    
    @Test
    public void pornVideo() {
    	
    	WebElement elm = driver.findElement(By.xpath("//a[@href='/video/ph5ceaba51c41cb/6-way-ghetto-orgy']"));
    	
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	
    	js.executeScript("arguments[0].scrollIntoView(true);", elm);
    	
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elm);
    	
    	elm.click();
    }
	
	@Test
	public void toGetText() {
		
		 String text = driver.findElement(By.xpath("//h1[contains(text(),'Hottest Porn Videos - 500 Videos')]")).getText();
		 
		 System.out.println("Expected Text is : "+text);
		 
		 //Using JavascriptExecutor we can handle hidden web elements
		 
		//((JavascriptExecutor) driver).executeScript("document.getElementsByClassName(element locator).click();");
	}
    
  
    @AfterClass
    public void tearDown() {
    	
    	driver.quit();
    }

}
