package webdriverCommands;

import java.io.File;
import java.io.FileWriter;

import org.testng.annotations.Test;

import helperClasses.TestBase;

public class WritePageSource extends TestBase {
	
	@Test
	public void pageSource() {
		
		String source = driver.getPageSource();
		
		System.out.println(source);
		
		try {
			 
			 File newFile = new File("D://Pagesource.txt");
			 
			 FileWriter fw = new FileWriter(newFile);
			 
			 fw.write(source);
			 
			 fw.close();
			 
		    }
		    catch(Exception e) {
		    	
		    	System.out.println(e);
		    }
	}

}
