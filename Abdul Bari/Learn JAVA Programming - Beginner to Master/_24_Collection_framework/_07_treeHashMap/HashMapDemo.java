package _07_treeHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));    
        hm.put(4, "E");
        hm.put(7, "F");
        System.out.println(hm);
        hm.put(6, "G");
        System.out.println(hm.get(2));
        System.out.println(hm.keySet());
        System.out.println(hm.keySet().getClass());
        System.out.println(hm.entrySet());

        for (Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
