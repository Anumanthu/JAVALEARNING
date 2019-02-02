package practiceproblems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		
		
		String input="C://Users//ANUMANTHU//Desktop//Selenium Learning//input.txt";
		
		String output="C://Users//ANUMANTHU//Desktop//Selenium Learning//output.txt";
		
		  FileInputStream in = null;
	      FileOutputStream out = null;
	      
	      

	      try {
	         in = new FileInputStream(input);
	         out = new FileOutputStream(output);
	         
	         int c;
	         
	         
	         //System.out.println(in.available());
	         //System.out.println(out.available());
	         
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
		
		
	      //System.out.println(in.available());
	     // System.out.println(out.available());
	      
	}

}
