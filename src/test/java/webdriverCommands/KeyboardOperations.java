package webdriverCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyboardOperations {

	public WebDriver driver;
	 
	 @BeforeClass
	 public void StartBrowser() {
		 
		    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
			//Create Chrome driver's instance
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
						
			//Set implicit wait of 10 seconds
			//This is required for managing waits in selenium webdriver
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     }
	 
	 @AfterClass
	 public void endTest() {
		  
		 driver.quit();
	 }
	 
	 @Test
	 public void keyActions() throws InterruptedException {
		 
		 driver.get("https://www.google.com");
	     Thread.sleep(2000);
	        
	        driver.findElement(By.name("q")).sendKeys("selenium");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li[2]/div[1]/div/span")).click();
	        Thread.sleep(2000);
	        
	        Actions a = new Actions(driver);
	        
	        a.sendKeys(Keys.END).build().perform();
	        Thread.sleep(2000);
	        
	        a.sendKeys(Keys.HOME).build().perform();
	        Thread.sleep(2000);
	        
	        a.sendKeys(Keys.ARROW_DOWN).build().perform();
	        Thread.sleep(2000);
	        
	        a.sendKeys(Keys.ARROW_UP).build().perform();
	        Thread.sleep(2000);
	    
	        a.sendKeys(Keys.F5).build().perform();
	        Thread.sleep(2000);
	        
	        /*a.sendKeys(Keys.chord(Keys.CONTROL,"s")).build().perform();;
	        Thread.sleep(2000);*/
	        
	        a.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"s")).build().perform();
	        Thread.sleep(5000);
	
	 }
	 
	 @Test
	 public void test() {
		 
		/*// System Property for Chrome Driver   
	        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");  
	          
	             // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();
	        
	      //Maximize the browser  
	          driver.manage().window().maximize();*/
	          
	           // Launch Website  
	        driver.navigate().to("http://www.javatpoint.com/");    
	          
	          //Scroll down the webpage by 5000 pixels  
	        JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 5000)");   
	          
	         // Click on the Search button  
	        driver.findElement(By.linkText("Core Java")).click();     
	  
	    }  
} 