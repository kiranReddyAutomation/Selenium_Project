package practice;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TakeScreenshot {
	
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
	
	driver.get("https://selfcare.actcorp.in/web/hyd/home");
	
    }
	
	@Test
    public void testMethod() throws IOException {
		
		WebElement elm = driver.findElement(By.xpath("//a[@class='logo']"));
		
		File src = ((TakesScreenshot)elm).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("./Screenshots/pic.png"));
		
		//Using WebDriver4
		File src1 = driver.findElement(By.xpath("//a[@class='logo']")).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src1, new File("./Screenshots/photo.png"));
	}
	
	@AfterClass
	public void quitTheBrowser() {
		
		driver.quit();
	}

}
