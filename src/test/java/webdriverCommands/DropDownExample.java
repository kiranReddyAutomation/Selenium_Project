package webdriverCommands;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	
	public static void main(String args[]) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		//Create Chrome driver's instance
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
					
		//Set implicit wait of 10 seconds
		//This is required for managing waits in selenium webdriver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");	//enter url
		
		WebElement state = driver.findElement(By.id("state"));
		
		selectUsingVisibleText(state,"Texas");
		
		getAllDropDownData(state);
		
		selectVlaueFromAllDropDownData(state);
		
		driver.quit();
	}
	
	public static void selectUsingValue(WebElement element, String value){
		Select select = new Select(element);
		System.out.println("selectUsingValue and value is: "+value);
		select.selectByValue(value);
	}
	
	public static void selectUsingIndex(WebElement element, int index){
		Select select = new Select(element);
		System.out.println("selectUsingIndex and index is: "+index);
		select.selectByIndex(index);
	}
	
	public static void selectUsingVisibleText(WebElement element, String visibleText){
		Select select = new Select(element);
		System.out.println("selectUsingVisibleText and visibleText is: "+visibleText);
		select.selectByVisibleText(visibleText);
	}
	
	public static void deSelectUsingValue(WebElement element, String value){
		Select select = new Select(element);
		System.out.println("deSelectUsingValue and value is: "+value);
		select.deselectByValue(value);
	}
	
	public static void deSelectUsingIndex(WebElement element, int index){
		Select select = new Select(element);
		System.out.println("deSelectUsingIndex and index is: "+index);
		select.deselectByIndex(index);
	}
	
	public static void deSelectUsingVisibleText(WebElement element, String visibleText){
		Select select = new Select(element);
		System.out.println("deselectByVisibleText and visibleText is: "+visibleText);
		select.deselectByVisibleText(visibleText);
	}
	
	public static List<WebElement> selectVlaueFromAllDropDownData(WebElement element){
		Select select = new Select(element);
		List<WebElement> elementList = select.getOptions();
		for(WebElement ele: elementList){
			//log.info(ele.getText());
			System.out.println(ele.getText());
			if(ele.getText().equals("Indiana")) {
				
				ele.click();
				break;	
		    }
		}	
		return elementList;
	}
	
	public static List<String> getAllDropDownData(WebElement element){
		Select select = new Select(element);
		List<WebElement> elementList1 = select.getOptions();
		List<String> valueList = new LinkedList<String>();
		for(WebElement ele: elementList1){
			//log.info(ele.getText());
			System.out.println(ele.getText());
			valueList.add(ele.getText());
		}
		return valueList;
	}

}
