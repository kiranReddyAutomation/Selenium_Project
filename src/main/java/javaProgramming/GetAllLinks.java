package javaProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetAllLinks {
	
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
			
			driver.get("https://xnxx2.pro/tag/porn-360-1.html");
			
	 }
	 
	 @Test
	 public void getAllLinksFromWebpage() {
		 
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 
		 System.out.println(links.size());
		 
		 ArrayList<String> data = new ArrayList<String>();
		 
		 for(int i=0;i<links.size();i++) {
			 
		 System.out.println(links.get(i).getText());	 
			 
		 data.add(links.get(i).getAttribute("href"));
		 
		 System.out.println(links.get(i).getAttribute("href"));
			 
		 }
		 
		 System.out.println(data.size());
	 }
	 
	 @AfterClass
	 public void endTest() {
		  
		 driver.quit();
	 }

}
