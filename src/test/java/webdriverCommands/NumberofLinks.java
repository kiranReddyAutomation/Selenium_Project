package webdriverCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import helperClasses.TestBase;

public class NumberofLinks extends TestBase {
	
	int enable=0;
    int disable=0;
 
    @Test
    public void findAllLinks() throws InterruptedException {
    	
    	List<WebElement> elements= driver.findElements(By.tagName("a"));
    	
        System.out.println(elements.size());
        
        for (WebElement webElement : elements) {
        	
            if (webElement.isEnabled()) {
            	
                enable++;
            }
            
            else {
                
                disable++;
            }
    }
        System.out.println("enable links are:"+enable);
        
        System.out.println("disable links are:"+disable);
        
        Thread.sleep(5000);
    }
}
	 	 
