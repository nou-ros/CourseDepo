import java.lang.*;

class TV
{
	public void switchON() { System.out.println(" TV is switched on! ");}
	public void changeChannel() { System.out.println(" TV channel is changes ");}
}

class SmartTV extends TV
{
	@Override
	public void switchON() { System.out.println(" SmartTV is switched on! ");}
	@Override
	public void changeChannel() { System.out.println(" SmartTV channel is changes ");}

	public void browse(){ System.out.println("Smart tv browsing");}
}

public class _06_Method_Overriding_Example_01{
	public static void main(String [] args)
	{
		TV t = new TV();
		t.switchON();
		t.changeChannel();
		
		SmartTV st = new SmartTV();
		st.browse();
		st.switchON();
		st.changeChannel();
	}
}