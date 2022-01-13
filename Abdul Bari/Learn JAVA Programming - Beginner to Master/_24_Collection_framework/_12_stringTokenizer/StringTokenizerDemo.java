package _12_stringTokenizer;

import java.util.StringTokenizer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        /*
        String data = "name=Nouros; addres=Dhaka; country=Bangladesh; dept=CSE";  
        // string and delimeters[=,;," "]
        StringTokenizer stk = new StringTokenizer(data,"=; "); 
        String s;
        while(stk.hasMoreTokens()){
            s = stk.nextToken();
            System.out.println(s);
        }
        */
        try {
            FileInputStream fis = new FileInputStream("./_12_stringTokenizer/numbers.txt");
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String data = new String(b);

            StringTokenizer stk = new StringTokenizer(data,","); 
            String s;
            ArrayList<Integer> al = new ArrayList<>();
            while(stk.hasMoreTokens()){
                s = stk.nextToken();
                al.add(Integer.valueOf(s));
            }
            System.out.println(al);
        } catch (FileNotFoundException e) {
           System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        }
       
    }
}
