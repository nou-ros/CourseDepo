package _04_priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;


//PriorityQueue class implements Queue interface which extends Collection interface
//It is implemented using Array as a basic data structure
//It represents Heap datastructure
//default if element is small then priority high, if element is high then priority low
//highest priority element will be deleted first when use delete


// this will make if element is small then priority low, if element is high then priority high 
class MyCom implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2){
        if(o1 < o2) return 1;
        if(o1 > o2) return -1;
        return 0;
    }
}

public class PriorityQueueDemo {
    public static void main(String args[]){
        // PriorityQueue<Integer> p = new PriorityQueue<>();
        PriorityQueue<Integer> p = new PriorityQueue<>(new MyCom());
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println(p.peek());

        p.forEach(x -> System.out.println(x));
        p.poll();
        System.out.println("After deletion");
        p.forEach(x -> System.out.println(x));
    }
}
