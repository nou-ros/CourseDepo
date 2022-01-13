package _08_linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

// LinkedHashMap can be used as cache memory. 
// So with limited size less accessible value will be removed automatically. 
public class LinkedHashMapDemo {
    public static void main(String[] args) {
       
        // LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(5);
        // size(auto increasable), loading factor, order of access
        // LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(5, .75f, false);
       
        // to show by the order of access true(least access first and most access last)
        // LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(5, .75f, true);
        
        // with a fixed size(if we insert more than 5 elements least accessed value will be deleted automatically)
        // but if false delete first element -> A
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(5, .75f, true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size() > 5;
            }
        };
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(5, "E");
        lhm.put(4, "D");

        String s = lhm.get(2);
        s = lhm.get(5);
        s = lhm.get(1);
        lhm.put(6, "F");
        lhm.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
