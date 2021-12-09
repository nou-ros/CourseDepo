
package _01_while_dowhile;

public class _01_While_doWhile {

    public static void main(String[] args) {
        // TODO code application logic here
        int i=1,j=1,n=100;
        System.out.println("While");
        while(i<n)
        {
            System.out.println(i);
            i=i*2;
        }
        System.out.println("Do While");
        do{
            System.out.println(j);
            j=j*2;
        }while(j<n);
        
//        while(trur) //infine loop
    }
    
}
