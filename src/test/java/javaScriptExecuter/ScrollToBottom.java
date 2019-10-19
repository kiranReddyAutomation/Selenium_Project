package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helperClasses.TestBase;

public class ScrollToBottom extends TestBase {
		
	@Test
	public void javaScript() {
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("scrollBy(0,2500)");

	//((JavascriptExecutor)driver).executeScript("scroll(0,400)");
}
	
	@Test
	public void scrollIntoView() throws InterruptedException {
		
		// Create instance of Javascript executor
		JavascriptExecutor je = (JavascriptExecutor) driver;
		 
		//Identify the WebElement which will appear after scrolling down
		WebElement element = driver.findElement(By.xpath("//b[contains(text(),'Open New Page')] "));
		  
		// now execute query which actually will scroll until that element is not appeared on page.
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		
		Thread.sleep(5000);
		
		element.click();
		 
		// Extract the text and verify 
		System.out.println(element.getText());
		
	}

}