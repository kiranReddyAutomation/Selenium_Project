package dynamic_Xpath_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example1 {
	
	public WebDriver driver;
	 
	 @BeforeClass
	 public void StartBrowser() {
		 
		 System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe" );
		 
		 driver= new FirefoxDriver();
			
		 driver.manage().window().maximize();

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	     // Launch Website  
		 driver.get("http://demo.automationtesting.in/Register.html");

	 }
	 
	 @AfterClass
	 public void endTest() {
		  
		 driver.quit();
	 }  
                   
     @Test
     public void firefoxDriver() throws InterruptedException {
        
      // Click on the Custom Search text box and send value  
     driver.findElement(By.xpath("//a[contains(text(), 'SwitchTo')]")).click();
     
     driver.findElement(By.xpath("//a[contains(text(), 'Windows')]")).click();
     
     Thread.sleep(5000);
	 
     }
}