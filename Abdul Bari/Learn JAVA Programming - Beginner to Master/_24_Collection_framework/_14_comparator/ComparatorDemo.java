package _14_comparator;

import java.util.Comparator;
import java.util.Arrays;

class My implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        if(i1 < i2)
            return 1;
        if(i1 > i2)
            return -1;
        return 0;
    }
}

// compare elements by elements
public class ComparatorDemo {
    public static void main(String[] args) {
        
        int a[] = { 2, 4, 6, 8, 1, 3, 7};
        int b[] = { 1, 4, 6, 8, 1, 3, 5};
    
        // System.out.println(Arrays.compare(a, b));

        int c[] = Arrays.copyOf(a, 4);
        // for(int x : c)
        //     System.out.println(x);
        
        // Arrays.fill(c, 10);
        // for(int x:c)
        //     System.out.println(x);

        Arrays.sort(c);
        System.out.println(Arrays.binarySearch(c, 4));


        Integer d[] = {2, 3, 5, 1, 9, 4};
        for(Integer x:d)
            System.out.println(x);

        System.out.println("****");
        Arrays.sort(d, new My());

        for(Integer x:d)
            System.out.println(x);
    }
    
}
