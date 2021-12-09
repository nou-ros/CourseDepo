
package _03_bitwise;

public class _03_Bitwise {

    public static void main(String[] args) {
        int x = 0b1010; //10 binary
        int y = 0b0110; //6 binary
        int m = 0b1000;
        int k = -0b1010;
        int a,b,c,n,o,p,q,r; 
        
        a = x&y;
        b = x|y;
        c = x^y;
        n = m<<2; //left shift -> n*2^k
        o = m>>2; //right shift -> n/2^K
        p = k>>1; //without signbit
        q = k>>>1; //with signbit 
        r = ~x;
        System.out.println(a + " " + b + " " + c + " " + n + " " + o + " " + p + " " + q + " " + r);
        
        System.out.println(String.format("%s",Integer.toBinaryString(k))); 
        System.out.println(String.format("%32s",Integer.toBinaryString(q)));
        
        System.out.println(String.format("%s",Integer.toBinaryString(x))); 
        System.out.println(String.format("%32s",Integer.toBinaryString(r)));
        System.out.println(r);
        
    }
    
}
