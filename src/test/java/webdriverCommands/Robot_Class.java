package webdriverCommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robot_Class {
	
	WebDriver driver;
	
	@Test
	public void robot_Class_Examples() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		//Create Chrome driver's instance
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
					
		//Set implicit wait of 10 seconds
		//This is required for managing waits in selenium webdriver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click(); 
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("admin123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("lastName")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("photofile")).click();
		
		/*String imagePath = "D:\\Images";
		
		String inputImagePath = "D:\\Images\\Uploads";
		
		Pattern FileInputBox = new Pattern(imagePath+ "Capture");*/
		
		
	}

}
