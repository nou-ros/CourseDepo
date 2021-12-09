
package _01_printing;

public class _01_printing {

    public static void main(String[] args) {
        int x=10,y=20;
        float b=12.55f;
        char c='A';
        String str = "hello";
        System.out.println(x+y);
        System.out.printf("Hello %d %f %c world\n",x,b,c);
        System.out.printf("Hello %o %f %c world\n",x,b,c);
        
         /*int a=10;//a=-10
        System.out.printf("%05d",a);*/
        
        /*float a=123.45f;//3.45f
        System.out.printf("%6.2f",a);*/
        
        String str2="Java";
        System.out.printf("%20s",str2);
        
    }
    
}
