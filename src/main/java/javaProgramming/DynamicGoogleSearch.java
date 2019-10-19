package javaProgramming;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DynamicGoogleSearch {
	
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
			
			driver.get("https://www.google.com/");
			
	 }
	 
	 @Test
	 public void getAutosuggestionList() throws InterruptedException {
		 
		//ul[@class='erkvQe']/li/descendant::div[@class='sbl1']
		 driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing");
		 
		 List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']/li/descendant::div[@class='sbl1']"));
		 
		 System.out.println("Total number of suggestions in search box : "+list.size());
		 
		 for(int i=0;i<=list.size();i++) {
			 
			 System.out.println(list.get(i).getText());	 
			 
			 if(list.get(i).getText().equals("testing life cycle")) {
				 
				 list.get(i).click();
				 
				 Thread.sleep(5000);
				 
				 break;
			 } 
		 } 
	 }
	
	@AfterClass
	 public void endTest() {
		  
		 driver.quit();
	 }

}
