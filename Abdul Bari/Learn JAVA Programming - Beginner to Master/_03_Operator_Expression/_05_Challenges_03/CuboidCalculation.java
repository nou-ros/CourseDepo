import java.lang.*;
import java.util.Scanner;

public class CuboidCalculation{
	public static void main(String args[])
	{
		// Cuboid area, volume calculation
		int length, breadth, height;
		int totalArea, volume;
		System.out.println("Enter length, breadth and height: ");
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		breadth = sc.nextInt();
		height = sc.nextInt();
		totalArea = 2*(length*height+length*breadth+breadth*height);
		volume = length*height*breadth;
		System.out.println("Total Area: " + totalArea);
		System.out.println("Volume: " + volume);
		
	}
}