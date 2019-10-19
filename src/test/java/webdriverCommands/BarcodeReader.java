package webdriverCommands;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeReader {
	
    static WebDriver driver;
	
	@Test
	public void barcodeReading() throws ReaderException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	
	//Create Chrome driver's instance
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://internationalbarcodes.com/sample-images/");
				
	//Set implicit wait of 10 seconds
	//This is required for managing waits in selenium webdriver
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	WebElement elm = driver.findElement(By.xpath("//a[@title='Code-128']//img[@class='attachment-thumbnail size-thumbnail wp-post-image lazyloaded']"));
	
    JavascriptExecutor js=((JavascriptExecutor)driver);
	
	js.executeScript("arguments[0].scrollIntoView(true);", elm);

	String barcodeUrl = elm.getAttribute("src");
	
	System.out.println(barcodeUrl);
	
	URL url =new URL(barcodeUrl);
	
	BufferedImage buffImg = ImageIO.read(url);
	
	LuminanceSource lmnsrc = new BufferedImageLuminanceSource(buffImg);
	
	BinaryBitmap bmap = new BinaryBitmap(new HybridBinarizer(lmnsrc));
	
	Result res = new MultiFormatReader().decode(bmap);
	
	System.out.println(res.getText());
	
    }
	
}
