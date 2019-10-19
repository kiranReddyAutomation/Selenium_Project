package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class DragAndDrop {
	
	public static WebDriver driver;
	
	@BeforeClass
    public void setUpBrowser() {
    	
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		//Create Chrome driver's instance
		driver = new ChromeDriver();
	
	    driver.manage().window().maximize();
				
	//Set implicit wait of 10 seconds
	//This is required for managing waits in selenium webdriver
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://emicalculator.net/");
	
    }
    
    @Test
    public void loanTenure() throws InterruptedException {
    	
    	Actions act = new Actions(driver);
    	
    	WebElement loanSliderCircle = driver.findElement(By.cssSelector("#loanamountslider>span"));
    	
    	WebElement interestSliderCircle = driver.findElement(By.cssSelector("#loaninterestslider>span"));
    	
    	WebElement tenureSliderCircle = driver.findElement(By.cssSelector("#loantermslider>span"));	
    	
    	act.dragAndDropBy(loanSliderCircle, 83, 0).build().perform();
    	Thread.sleep(2000);
    	
    	act.dragAndDropBy(interestSliderCircle, 88, 0).build().perform();
    	Thread.sleep(2000);
    	
    	act.dragAndDropBy(tenureSliderCircle, -111, 0).build().perform();
    	Thread.sleep(2000);
    	
    	WebElement emiValue = driver.findElement(By.cssSelector("#emiamount>p>span"));
    	
    	String emiText = emiValue.getText();
    	
    	Assert.assertEquals("92,439", emiText);
    	Thread.sleep(2000);
    }
    
    @AfterClass
    public void tearDown() {
    	
    	driver.quit();
    }
}
