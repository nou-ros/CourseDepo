package _03_arrayDeque;

import java.util.ArrayDeque;
// ArrayDeque class implements Deque interface which extends Queue interface which extends Collection interface
// ArrayDeque can be used as stack if inserting using offerLast and deleting using pollLast(LIFO) 
// reverse -> offerFirst for insertion and pollFirst for deletion also stack
// ArrayDeque can be used as queue if inserting using offerLast and deleting using pollFirst(FIFO) 
// reverse -> offerFirst for insertion and pollLast for deletion also queue
public class ArrayDequeDemo {
    public static void main(String args[]){
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        // dq.forEach(x -> System.out.println(x));
        //dq.pollLast();

        //dq.pollFirst();
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.forEach(x -> System.out.println(x));
    }
}
