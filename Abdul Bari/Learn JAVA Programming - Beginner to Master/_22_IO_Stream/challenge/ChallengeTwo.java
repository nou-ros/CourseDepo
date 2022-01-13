package challenge;

import java.io.*;

public class ChallengeTwo {
    public static void main(String args[]) {
        try{
            FileInputStream fis1 = new FileInputStream("./challenge/Source.txt");
            FileInputStream fis2 = new FileInputStream("./challenge/Source2.txt");
            FileOutputStream fos = new FileOutputStream("./challenge/Destination2.txt");
            
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

            int b;
            while((b = sis.read()) != -1){
                fos.write(b);
            }
            fis1.close();
            fis2.close();
            sis.close();
            fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
