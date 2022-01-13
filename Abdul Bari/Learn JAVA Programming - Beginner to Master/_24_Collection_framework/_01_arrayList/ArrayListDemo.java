package _01_arrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// ArrayList implements List interface which extends Collection interface
// ArrayList is a dynamic array
public class ArrayListDemo{
    public static void main(String args[]){
        ArrayList<Integer> al1 = new ArrayList<>(20);
        al1.add(5);
        al1.add(0, 10);
        System.out.println(al1.size());
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        // al1.addAll(al2);
        al1.addAll(1, al2);
        System.out.println(al1);

        System.out.println(al1.contains(50));
        System.out.println(al1.get(3));
        System.out.println(al1.indexOf(70));
        al1.add(5, 70);
        System.out.println(al1.lastIndexOf(70));
        al1.set(6, 100);
        System.out.println(al1);

        // for(int i = 0; i < al1.size(); i++)
        //     System.out.println(al1.get(i));
        
        // for(Integer x : al1)
        //     System.out.println(x);

        // iteration with Iterator. It allows forward directional access only.
        // Iterator<Integer> it = al1.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // iteration with ListIterator. It allows bidirectional access
        // ListIterator<Integer> lit = al1.listIterator();
        // while(lit.hasNext()){
        //     System.out.println(lit.next());
        // }
        // iterating ListIterator with for loop
        // for( ;lit.hasNext(); )
        //     System.out.println(lit.next());
        
        // iteration with lambda
        // al1.forEach((x) -> { System.out.println(x); });
        // al1.forEach(System.out::println);
        al1.forEach((x) -> show(x));
    }

    static void show(int n){
        if(n>60)
            System.out.println(n);
    }
}
