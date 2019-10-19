package javaProgramming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helperClasses.TestBase;

public class PrintDynamicWebtableData extends TestBase {
	
	@Test
	public void printDynamicWebTableData() {
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));

		int rowCount = rows.size();

		System.out.println("Total rows in web Table are : " + rowCount);

		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td"));

		int colCount = cols.size();

		System.out.println("Total columns in web Table are : " + colCount);
		
		String firstpart = "//*[@id='customers']/tbody/tr[";
		
		String secondpart = "]/td[";
		
		String thirdpart = "]";
		
		for(int i=2; i<=rowCount;i++) {
			
			for(int j=1; j<=colCount;j++) {
				
				String finalpart = firstpart+i+secondpart+j+thirdpart;
				
				String text = driver.findElement(By.xpath(finalpart)).getText();
				
				System.out.print(text+" | ");
			}
			System.out.println();
		} 
		
		
		//Get particular Row cell data
		String rowData = driver.findElement(By.xpath("//td[contains(text(),'Island Trading')]/parent::*/td[3]")).getText();
		
		System.out.println("Data of row is : "+rowData);

	}

}
