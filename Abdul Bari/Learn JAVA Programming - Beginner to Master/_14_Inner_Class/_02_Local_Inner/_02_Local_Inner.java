import java.lang.*;

class Outer{
	void display()
	{
		class Inner{
			void innerDisplay()
			{
				System.out.println("Inner Display");
			}
		}
		//Inner i = new Inner();
		// i.innerDisplay();
		new Inner().innerDisplay();
	}
}

public class _02_Local_Inner{
	public static void main(String [] args)
	{
		Outer o = new Outer();
		o.display();
	}
}