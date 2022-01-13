package challenge;
import java.io.*;

public class ChallengeOne {
    public static void main(String args[]) {
        try{
            FileInputStream fis = new FileInputStream("./challenge/Source.txt");
            FileOutputStream fos = new FileOutputStream("./challenge/Destination.txt");

            int b;
            while((b = fis.read()) != -1){
                if(b >= 65 && b <= 90)fos.write(b+32);
                else fos.write(b);
            }
            fis.close();
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
