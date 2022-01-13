package _01_file_stream;

import java.io.*;
// writing to file
public class FileOutput{
	public static void main(String args[]){
		try{
			FileOutputStream fos = new FileOutputStream("./_01_file_stream/test.txt");
			String str = "Learn java Programming";
			
			byte b[] = str.getBytes();
			/*
			// reading one by one byte
			for(byte x : b){
				fos.write(x);
			}*/

			// reading all the bytes
			//fos.write(str.getBytes());
			
			// read from an offset to a limit
			fos.write(b, 6, str.length()-6);
			fos.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
