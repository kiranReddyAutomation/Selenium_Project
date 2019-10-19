package helperClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public WebDriver driver;
	 
	 @BeforeTest
	 public void StartBrowser() {
		 
		    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
			//Create Chrome driver's instance
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
						
			//Set implicit wait of 10 seconds
			//This is required for managing waits in selenium webdriver
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			//driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
			
			//driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	 }
	 
	 @AfterClass
	 public void endTest() {
		  
		 driver.quit();
	 }

}
