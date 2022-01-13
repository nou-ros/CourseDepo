package _11_properties;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// a string:string -> key:value pair.
// subclass of hashtable
public class PropertiesDemo {
    public static void main(String[] args) {
        try {
            Properties p = new Properties();
            /*
            p.setProperty("Brand", "Dell");
            p.setProperty("Processor", "i7");
            p.setProperty("OS", "Windows 10");
            p.setProperty("Model", "Latitude");
            p.storeToXML(new FileOutputStream("./_11_properties/text.xml"), "Laptop");
            p.store(new FileOutputStream("./_11_properties/text.txt"), "Laptop");
            */
          
            p.loadFromXML(new FileInputStream("./_11_properties/text.xml"));
            System.out.println(p);
            System.out.println(p.getProperty("Model"));
          
        } catch (FileNotFoundException e) {
           System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        }

         
    }
}
