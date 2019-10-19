package webdriverCommands;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Ashot_Fullpage_Screenshot {
	
public static WebDriver driver;
	
	@Test
	public void fullpageScreenshot() throws IOException {	
		
	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	
	//Create Chrome driver's instance
	driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
				
	//Set implicit wait of 10 seconds
	//This is required for managing waits in selenium webdriver
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.sakshi.com/");
	
	Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
    
	ImageIO.write(screenshot.getImage(),"PNG",new File(".\\FullPageScreenshots\\ScreenPicture.png"));
	
	driver.quit();
	
  }
}
