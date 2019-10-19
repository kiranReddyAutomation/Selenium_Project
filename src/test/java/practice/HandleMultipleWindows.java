package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandleMultipleWindows {

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
	
	driver.get("http://popuptest.com/goodpopups.html");
	
    }
	
	@AfterClass
	public void quitTheBrowser() {
		
		driver.quit();
	}
	
	@Test
    public void multipleWindows() throws Exception {
		
		//1st MEthod 
		
		/*driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')] ")).click();
		
		ArrayList<String> arr = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println("Size of the array :"+arr.size());
			
		driver.switchTo().window(arr.get(1));
		
		System.out.println("Title of the child window :"+driver.getTitle() );
		
		driver.close();
		
		driver.switchTo().window(arr.get(0));
		
		System.out.println(" Title of the Parent window :"+driver.getTitle());
		
		}*/
	
	//2nd Method
		
	   /*driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')] ")).click();
	
	   Set<String> winIds = driver.getWindowHandles();
	   
	   Iterator<String> itr = winIds.iterator();
	   
	   String parentWindowId = itr.next();
	   
	   System.out.println("Parent window id :"+parentWindowId);
	   
	   String childWindowId = itr.next();
	   
	   System.out.println("child window id :"+childWindowId);
	   
	   driver.switchTo().window(childWindowId);
	   
	   Thread.sleep(2000);
	   
	   System.out.println("Title of the child window :"+driver.getTitle());
	   
	   driver.close();
	   
	   driver.switchTo().window(parentWindowId);
	   
	   Thread.sleep(2000);
	   
	   System.out.println("Title of the parent window :"+driver.getTitle());*/
	
	//3rd Method
		
	   driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')] ")).click();
	   
       Set<String> winIds = driver.getWindowHandles();
	   
	   Iterator<String> itr = winIds.iterator();
	
	   ArrayList<String> ids = new ArrayList<String>();
	   
	   while(itr.hasNext()) {
		   
		   ids.add(itr.next());
	   }
	   
	   driver.switchTo().window(ids.get(1));
	   
	   System.out.println("Title of the child window :"+driver.getTitle());
	   
	   driver.close();
	   
	   driver.switchTo().window(ids.get(0));
	   
	   System.out.println(" Title of the Parent window :"+driver.getTitle());

   }
}