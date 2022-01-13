package _01_genericDemo;
// 01
class Data<T> {
    private T obj;
    public void setData(T v){
        obj = v;
    }

    public T getData(){
        return obj;
    }
}

class MyArray<T>{
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

public class GenericDemo{
    public static void main(String args[]){
    // Generics have - Type Safety, Compile-time checking, No Typecasting
       Data<String> d = new Data<> ();
       d.setData("hello");
       System.out.println(d.getData());

       MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(12);
        ma.append(14);

        ma.display();
    }
}
