package interview_Practice;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class CustomListener extends TestListenerAdapter {
	
	//public static WebDriver driver;
		 
		 public void onTestFailure(ITestResult result){
			 
			 /*File src =((TakesScreenshot) Screenshot.driver).getScreenshotAs(OutputType.FILE);
		        
		        try {
		        	
					FileHandler.copy(src, new File("./Screenshots/"+result.getName()+".png"));
					
				    } catch (IOException e) {
					
					e.printStackTrace();
					
				    }*/
			 Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Screenshot1.driver);
			    
				try {
					
					ImageIO.write(screenshot.getImage(),"PNG",new File("./FullPageScreenshots/"+result.getName()+".png"));
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		        
		        System.out.println("Screenshot has Taken");
		 }

}
