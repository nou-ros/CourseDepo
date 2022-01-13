package _07_treeHashMap;

import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

// maps are key value pairs 
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));    
        tm.put(4, "E");
        tm.put(7, "F");
        System.out.println(tm);
        tm.put(6, "G");

        System.out.println(tm.ceilingEntry(5).getValue());
        System.out.println(tm.get(2));
        System.out.println(tm.keySet());
        System.out.println(tm.keySet().getClass());
        System.out.println(tm.entrySet());
        // to get the entry as key and value
        Entry<Integer, String> e = tm.firstEntry();
        System.out.println(e.getKey() + " " + e.getValue());
    }
   
}
