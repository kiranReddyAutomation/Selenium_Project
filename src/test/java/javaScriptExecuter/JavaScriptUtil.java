package javaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	
	 public static void flash(WebElement element, WebDriver driver) {
		
		String bgcolor = element.getCssValue("backgroundColor");
		
		for (int i=0; i<500; i++) {
			
			changeColor("#8a6d3b", element, driver);
			
			changeColor(bgcolor, element, driver);
			
		}
	}
		
	 public static void changeColor(String color, WebElement element, WebDriver driver ) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		
		try {
			Thread.sleep(20);
			}
		catch(InterruptedException e) {
				
			}
				
		}
		
		public static void drawBorder(WebElement element, WebDriver driver ) {	
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			js.executeScript("arguments[0].style.border = '3px solid red'", element);
		}
	
		public static String getTitleByJS(WebDriver driver ) {
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			String title = js.executeScript("return document.title;").toString();
			
			return title;
		}
		
        public static void clickElementByJS(WebElement element, WebDriver driver ) {	
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			js.executeScript("arguments[0].click();", element);
		}
        
        public static void generateAlertByJS(WebDriver driver, String message ) {	
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			js.executeScript("alert('" + message + "')");
		}
        
        public static void refreshByJS(WebDriver driver) {	
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			js.executeScript("history.go(0)");
		}
        
        public static void scrollIntoViewByJS(WebElement element, WebDriver driver) {	
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
        
        public static void scrollPageDownByJS(WebDriver driver) {	
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
}


