package _06_treeSet;

import java.util.TreeSet;
import java.util.List;

// Tree takes log(n) time for operation
// In tree elements will  be sorted

public class TreeSetDemo{
    public static void main(String args[]){
        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));
        // it will be sorted set by default
        ts.add(25);
        // give nearest to (greater than)55 as it is not present
        System.out.println(ts.ceiling(55));
        System.out.println(ts);
    }
}