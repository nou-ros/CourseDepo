package _01_file_stream;

import java.io.*;
// reading from file 
public class FileInput {
    public static void main(String args[]){
		try{
			FileInputStream fis = new FileInputStream("./_01_file_stream/test.txt");
			//reading the full input.
			//byte b[] = new byte[fis.available()];
			//fis.read(b);
			//String str = new String(b);
			//System.out.println(str);

			// reading one by one 
			int x;
			while((x = fis.read()) != -1){
				System.out.print((char)x);
			}
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}
		
			
	}
}
