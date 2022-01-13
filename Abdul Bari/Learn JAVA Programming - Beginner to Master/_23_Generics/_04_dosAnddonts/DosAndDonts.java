package _04_dosAnddonts;
//4 
/**
 * 1. Only extends is allowed in Generic class definition
 * 2. extends is used for interfaces also
 * 3. extends from Only one class and multiple interfaces
 * 4. extends and super are allowed with ? in methods argument
 * 5. <?> will all types but cann't access
 * 6. Base type of an Object should be same or ? 
 */

class A{}
interface B{}
interface C{}

// class TestArray<T extends A> 1.
// class TestArry<T extends B> 2.
// class TestArray<T extends A & B & C> 3. 
// same as - class Mobile extends Phone implements Camera, VideoCall,
class TestArray<T> 
{
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

public class DosAndDonts {
    static void wildCard(TestArray<?> obj){
        obj.append("hello"); //5. we can pass any type of object but cann't access it 
        obj.append(null); // unless only null available
    }
    public static void main(String args[]){
        TestArray<String> ta = new TestArray<String>();
        TestArray<Object> ta2 = new TestArray<String>(); //6. not allowed super class base must of same type.
        TestArray<?> ta3 = new TestArray<String>();  //but can pass ? for super class
        wildCard(ta);
    }
}
