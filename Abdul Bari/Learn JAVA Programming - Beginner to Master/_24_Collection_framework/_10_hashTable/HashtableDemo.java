package _10_hashTable;

import java.util.Enumeration;
import java.util.Hashtable;

// it saves key and value pair and its also thread safe
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");

        //String s = (String)(ht.get(3));
        //System.out.println(s);
        

        // Enumeration<String> e = ht.elements();
        // Enumeration<Integer> e = ht.keys();
        // while(e.hasMoreElements())
        //     System.out.println(e.nextElement());

        // concatenate Z with value 
        // ht.compute(2, (k,v) -> v + "Z");
        // if key is absent then add a key and corresponding value to it
        ht.computeIfAbsent(6, (k)-> "YT" + k);
        System.out.println(ht);
    }
}
