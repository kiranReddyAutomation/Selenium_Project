package javaProgramming;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class CreateFile {
	
	public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException {
		
		PrintWriter writer = new PrintWriter("D://the-file-name.txt", "UTF-8");
		
		writer.println("The first line");
		
		writer.println("The second line");
		
		writer.close();
		
		/*try {
            //Whatever the file path is.
            File statText = new File("D://Test.txt");
            
            FileOutputStream is = new FileOutputStream(statText);
            
            OutputStreamWriter osw = new OutputStreamWriter(is); 
            
            Writer w = new BufferedWriter(osw);
            
            w.write("POTATO!!!");
            
            w.write("Cucumber");
            
            w.write("Tomoto");
            
            w.write("Onion");
            
            w.close();
            
        } catch (IOException e) {
        	
            System.err.println("Problem writing to the file statsTest.txt");
        }*/
		
		try{
            // Create new file
            String content = "This is the content to write into create file";
            
            String path="D://hi.txt";
            
            File file = new File(path);

            // If file doesn't exists, then create it
            if (!file.exists()) {
            	
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.write(content);
            
            bw.newLine();
            
            bw.write("This is kiran");
            
            bw.newLine();
            
            bw.write("This is kiran Reddy");
            
            bw.newLine();
            
            bw.write("This is Rishika");

            // Close connection
            bw.close();
        }
        catch(Exception e){
        	
            System.out.println(e);
        }
    }
    
}
