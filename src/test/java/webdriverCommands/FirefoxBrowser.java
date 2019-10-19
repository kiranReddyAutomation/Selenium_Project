package webdriverCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirefoxBrowser {
	
	public WebDriver driver;
	 
	 @BeforeClass
	 public void StartBrowser() {
		 
		 System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe" );  
	        
	        // Initialize Gecko Driver using Desired Capabilities Class  
	     DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	  
	     capabilities.setCapability("marionette",true);
	     
	     driver= new FirefoxDriver(capabilities);
			
		 driver.manage().window().maximize();
		 
		// Launch Website  
		  driver.get("http://www.javatpoint.com/");
						
			//Set implicit wait of 10 seconds
			//This is required for managing waits in selenium webdriver
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
	     
    }
	 
	 @AfterClass
	 public void endTest() {
		  
		 driver.quit();
	 }  
                   
     @Test
     public void firefoxDriver() {
        
      // Click on the Custom Search text box and send value  
     driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");  
        
         
      
    }  

}
