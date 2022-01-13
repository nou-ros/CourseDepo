package _03_genericMethods;
// 03

class A{}
class B extends A{}
class C extends B{}


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


public class GenericMethods {

    // generic method
    static <E> void show(E[] list){
        for(E x : list){
            System.out.println(x);
        }
    }

    // generic method with bound
    static <E extends Number> void showBound(E[] list){
        for(E x : list){
            System.out.println(x);
        }
    }

    // generic for argument - wildCard ? anyType(unbounded)
    static void wildCard(TestArray<?> obj){
        obj.display();
    }

    // generic for argument 
    // wildCard ? anyType within a bound
    // allow a class and its super clases(no child class) with super(LowerBound)
    // static void wildCard2(TestArray<? super A> obj){ 
    // allow a class and all its child/sub classes(no parent class) with extends(UpperBound)
    // static void wildCard2(TestArray<? extends Number> obj){
    static void wildCard2(TestArray<? extends B> obj){
        obj.display();
    }
    public static void main(String args[]){
      //show(new String[]{"Hi", "Go", "World"});
      //show(new Integer[]{10, 20, 30});


      //showBound(new Double[]{1.2, 2.02, 1.33});


        TestArray<String> ta1 = new TestArray<>();
        ta1.append("Hi");
        ta1.append("Bye");
        TestArray<Integer> ta2 = new TestArray<>();
        ta2.append(10);
        ta2.append(20);

        wildCard(ta1);
        wildCard(ta2);
        
        // TestArray<Double> ta3 = new TestArray<>();
        // wildCard2(ta3);

        TestArray<B> ta4 = new TestArray<>();
        wildCard2(ta4); 
        TestArray<C> ta5 = new TestArray<>();
        wildCard2(ta5);
    }
}
