package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOne {

	public WebDriver driver;
	
	public PageOne(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		//PageFactory.initElements(driver, PageOne.class);
	}
	
	@FindBy(xpath="//input[@id='texturl']")
	WebElement textField;
	
	@FindBy(xpath="//a[@id='convert1']")
	WebElement button;
	
	@FindBy(xpath="//a[@id='downloadq']")
	WebElement downloadButton;
	
	public void enterText(String text) {
		
		textField.sendKeys(text);
	}
	
	public void clickButton() {
		
		button.click();
	}
	
	public void clickDownloadButton() {
		
		downloadButton.click();
	}
	
}
