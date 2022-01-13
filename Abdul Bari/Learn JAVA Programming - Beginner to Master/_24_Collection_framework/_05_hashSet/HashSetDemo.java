package _05_hashSet;

import java.util.HashSet;

// Hash takes O(1) time for operation
// In hash elements will not be sorted
public class HashSetDemo {
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<Integer>();
        // number of size and loading factor
        // HashSet<Integer> hs = new HashSet<Integer>(20, 0.50f);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10); 
        System.out.println(hs);
    }
}
