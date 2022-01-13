package _02_bufferedStreamsReaders;

import java.io.*;

// Buffer temporary memory block for holding data
// Buffered makes the transition between program and device/file smooth if there is speed difference

// If we need to read bytes/ascii codes then FileInputStream and BufferedInputStream is better
// If we need to read unicodes then FileReader and BufferedReader is better
public class BufferedStreamsReader {
   public static void main(String[] args) {
       try{
        FileInputStream fis = new FileInputStream("./_02_bufferedStreamsReaders/test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        
        // reading from buffered input stream
        // int x;
        // while((x = bis.read()) != -1){
        //     System.out.print((char)x);
        // }
        
        // we can set mark is using buffer input stream but not file input stream
        // System.out.println("File Input Stream" + fis.markSupported());
        // System.out.println("Buffer Input Stream" + bis.markSupported());

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print(" <-> ");
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println();
        FileReader fr = new FileReader("./_02_bufferedStreamsReaders/test.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.print("Buffered Reader - ");
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        
        System.out.println(" String : " + br.readLine());
       }catch(FileNotFoundException e){
           System.out.println(e);
       }catch(IOException e){
           System.out.println(e);
       }
        
    }
}
