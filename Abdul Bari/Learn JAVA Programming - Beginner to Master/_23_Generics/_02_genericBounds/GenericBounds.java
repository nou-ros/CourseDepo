package _02_genericBounds;


// 02
class TestArray<T>{
    @SuppressWarnings("unchecked")
    T obj[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v){
        obj[length++] = v;
    }

    public void display(){
        for(int x = 0; x < length; x++){
            System.out.println(obj[x]);
        }
    }
}

class DemoArray extends TestArray<String>{

}
// if no parameters given in the generic the generic will become object type generic

// multiple parameters are allowed in generics - check map

/* if generics are inherited then 
1. we can have a specific generic type: 
- class DemoArray extends TestArray<String>
- DemoArray ma = new DemoArray();

2. Can have object type generic without any parameter: 
- class DemoArray extends TestArray
- DemoArray ma = new DemoArray();

3. can have generic type generic: 
class DemoArray<T> extends TestArray<T>
DemoArray<String> ma = new DemoArray<>();
 */

// Bound type generics
class BoundArray<T extends Number>{
    @SuppressWarnings("unchecked")
    T obj[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v){
        obj[length++] = v;
    }

    public void display(){
        for(int x = 0; x < length; x++){
            System.out.println(obj[x]);
        }
    }
}

public class GenericBounds {
    public static void main(String args[]){
        DemoArray ma = new DemoArray();
            ma.append("Hi");
            ma.append("bye"); 
            ma.display();

        BoundArray<Float> ba = new BoundArray<>();
        ba.append(12.5f);    
        ba.append(6.52f);
        ba.append(9.3f);
    }
}
