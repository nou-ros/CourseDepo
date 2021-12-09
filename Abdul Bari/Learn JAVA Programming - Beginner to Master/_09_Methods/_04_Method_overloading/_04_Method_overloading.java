import java.lang.*;

public class _04_Method_overloading{
	
	static int max(int x, int y)
	{
		return x>y?x:y;
	}
	static float max(float x, float y)
	{
		return x>y?x:y;
	}
	static int max(int x, int y, int z)
	{
		return x>y && x>z?x:(y>z?y:z);
	}

	public static void main(String [] args)
	{
		int a,b,c;
		float d,e;
		d=8f;
		e=9f;
		a=5;
		b=6;
		c=7;
		System.out.println(max(a,b));
		System.out.println(max(a,b,c));
		System.out.println(max(d,e));
	}
}