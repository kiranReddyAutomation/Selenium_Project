package javaProgramming;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MaxPriceInWebtable {
	
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
	 public void getMaxPriceFromDynamicWebTable() throws ParseException {
		 
		 int rowsNumber = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
		 
		 String firstpart = "//*[@id='leftcontainer']/table/tbody/tr[";

		 String secondpart = "]/td[4]";
		 
		 ArrayList<Integer> array = new ArrayList<Integer>();
		 
		 for (int i = 1; i < rowsNumber; i++) {
			 
			 String finalpart = firstpart + i + secondpart;
			 
			 //System.out.println(finalpart);
			 
			 String price = driver.findElement(By.xpath(finalpart)).getText();
			 
			 NumberFormat numFormat = NumberFormat.getNumberInstance();
			 
			 Number num = numFormat.parse(price);
			 
			 price = num.toString();
			 
			 System.out.println(price);
			 
			 Double m = Double.parseDouble(price);
			 
			 int intPrice = m.intValue();
			 
			 array.add(intPrice);
		 }
		 
		 Collections.sort(array);
		 
		 System.out.println(array);
		 
		 System.out.println(array.get(0));
		 
		 System.out.println(array.get(array.size()-1));
	 }
	 
	 @AfterClass
	 public void endTest() {
		  
		 driver.quit();
	 }

}
