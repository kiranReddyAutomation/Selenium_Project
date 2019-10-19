package javaScriptExecuter;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExample {
	
    static WebDriver driver;
	
	@Test
	public void javaScriptExecutor() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	
	//Create Chrome driver's instance
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.twoplugs.com/");
				
	//Set implicit wait of 10 seconds
	//This is required for managing waits in selenium webdriver
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	WebElement actfbr = driver.findElement(By.xpath("//ul[@class='control-bar']//li[2]//a[1]  "));
	
	JavaScriptUtil.flash(actfbr, driver);
	
	JavaScriptUtil.drawBorder(actfbr, driver);
	
	String title = JavaScriptUtil.getTitleByJS(driver);
	
	System.out.println(title);
	
	JavaScriptUtil.clickElementByJS(actfbr, driver);
	
	//JavaScriptUtil.generateAlertByJS(driver, " You clicked on link...>");
	
	JavaScriptUtil.refreshByJS(driver);
	
	WebElement elm = driver.findElement(By.xpath("//a[@class='green']"));
	
	JavaScriptUtil.scrollIntoViewByJS(elm, driver);
	
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	JavaScriptUtil.scrollPageDownByJS(driver);
	
	Thread.sleep(2000);
	
	driver.quit();
	
  }
}
