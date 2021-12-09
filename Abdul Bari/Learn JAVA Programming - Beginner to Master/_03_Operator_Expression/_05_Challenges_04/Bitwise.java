import java.lang.*;

public class Bitwise{
	public static void main(String args[])
	{
		// swapping two numbers with xor
		int a=10, b=20;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a: " + a + " b: " + b);

		//saving both number in the same byte
		byte x=9,y=12;
		byte z;
		z =(byte)(x<<4);
		z =(byte)(z|y);
		
		System.out.println((z&0b11110000)>>4);
		System.out.println((z&0b00001111));
	}
}	