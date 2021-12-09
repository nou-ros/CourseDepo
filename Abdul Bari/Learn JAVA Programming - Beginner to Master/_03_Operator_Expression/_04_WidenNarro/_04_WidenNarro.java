
package _04_widennarro;

public class _04_WidenNarro {

    public static void main(String[] args) {
     byte b = 5;
     short s = 200;
     int i = 10;
     long l = 10;
     float f = 10;
     double d = 10;
     char c = 10;
     boolean bl=true;
     
     //Widening/Upcasting
//     s = b;
//     i = b;
//     l = b;
//     l = i;
//     f = s;
     
     // Narrowing/downcasting
     b =(byte)s; //there maybe loss of data while narrowing.
     System.out.println(b);
    }
    
}
