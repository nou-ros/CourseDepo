package _02_linkedList;

import java.util.LinkedList;
import java.util.List;

// LinkedList implements List interface which extends Collection interface
// LinkedList in java is a doubly linkedList

public class LinkedListDemo{
    public static void main(String args[]){
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        ll1.add(10);
        ll1.add(0, 5);
        ll1.addAll(ll2);
        ll1.add(5, 70);
        ll1.set(6, 100);
        ll1.forEach(n-> show(n));
    }

    static void show(int n){
        if(n > 70)
            System.out.println(n);
    }
}