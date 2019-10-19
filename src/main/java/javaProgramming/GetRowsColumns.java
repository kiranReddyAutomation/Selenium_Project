package javaProgramming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetRowsColumns {
	
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
			
			driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
			
	 }
	 
	 @Test
	 public void getRowsColumnsDynamicWebTableData() {
		 
		int rowsNumber = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();

		System.out.println("Number of rows are : " + rowsNumber);

		int colNumber = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td")).size();

		System.out.println("Number of columns are : " + colNumber);

		String firstpart = "//*[@id='leftcontainer']/table/tbody/tr[";

		String secondpart = "]/td[";

		String thirdpart = "]";

		for (int i = 1; i <= rowsNumber; i++) {

			for (int j = 1; j <= colNumber; j++) {

				String finalpart = firstpart + i + secondpart + j + thirdpart;

				String text = driver.findElement(By.xpath(finalpart)).getText();

				System.out.print(text + " | ");
			}
			System.out.println();
		}

	}
	 
	 @AfterClass
	 public void endTest() {
		  
		 driver.quit();
	 }

}
