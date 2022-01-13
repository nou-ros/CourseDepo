package _09_linkedHashSet;

import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Iterator;

// it store only values 
// linkedHashset will show as creation order while iteration
 // HashSet will show as sorted while iteration
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        HashSet<String> hs = new HashSet<>(10);
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");

        // lhs.forEach(System.out::println);
        Iterator<String> itr = lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
