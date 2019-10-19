package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageOneTest {
	
	@Test
	public void youtubeDownloader() {
		
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		//Create Chrome driver's instance
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.onlinevideoconverter.com/youtube-converter");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		PageOne obj = new PageOne(driver);
		
		//PageOne obj = PageFactory.initElements(driver, PageOne.class);
		
		obj.enterText("https://www.youtube.com/watch?v=HZ7PAyCDwEg");
		
		obj.clickButton();
		
		obj.clickDownloadButton();
	}

}
