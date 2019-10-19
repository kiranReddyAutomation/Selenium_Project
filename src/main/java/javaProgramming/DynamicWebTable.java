package javaProgramming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helperClasses.TestBase;

public class DynamicWebTable extends TestBase {

	@Test
	public void handleDynamicWebTable() {
		
		/*JavascriptExecutor je = (JavascriptExecutor)driver;
		
		je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//strong[contains(text(),'Table 1: Table Types in WDC 2015 Corpus')] ")));
		*/
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		
		 int rowCount = rows.size();
		 
		 System.out.println("Total rows in web Table are : "+rowCount);
		
		//String before_xpath = "//*[@id='toccontent']/table[1]/tbody/tr[";
		 
		 String before_xpath = "//*[@id='customers']/tbody/tr[";
		
		String after_xpath = "]/td[1]";
		
		for(int i=2; i<=rowCount;i++) {
			
		String actualxpath = before_xpath+i+after_xpath;	
			
		WebElement name = driver.findElement(By.xpath(actualxpath));
			
		System.out.println(name.getText());
		
		if(name.getText().equals("Island Trading")) {
			
		System.out.println("Name is :"+name.getText()+" found at index number : "+(i-1));
		
		break;
		
		}	
			
	  }
		
	  System.out.println("************************");
	  
	  List<WebElement> cols = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td"));
	  
	  int colCount = cols.size();
	  
	  System.out.println("Total columns in web Table are : "+colCount);
	  
	  String beforexpathColumns = "//*[@id='customers']/tbody/tr[2]/td[";
	  
	  String afterxpathColumns = "]";
	  
	  for(int i=1; i<=colCount;i++) {
			
			String actualxpath = beforexpathColumns+ i +afterxpathColumns;	
				
			WebElement name = driver.findElement(By.xpath(actualxpath));
				
			System.out.println(name.getText());
	  }	
	  
	  
	}
}
