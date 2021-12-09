import mypack1.Demo;
import mypack1.Demo2;
import mypack1.inner.Demo3;

class _01_Package{
	public static void main(String [] args)
	{
		Demo d = new Demo();
		d.display();
		Demo2 d2 = new Demo2();
		d2.display();

		Demo3 d3 = new Demo3();
		d3.display();
	}

}