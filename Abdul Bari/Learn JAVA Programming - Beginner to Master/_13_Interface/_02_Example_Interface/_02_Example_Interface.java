import java.lang.*;

class Phone{
	public void call() { System.out.println(" Phone Call "); }
	public void sms() { System.out.println(" Send SMS "); }
}

interface ICamera{
	void click();
	void record();
}

interface IMusicPlayer{
	void play();
	void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
	public void videoCall(){ System.out.println(" Smart Phone video calling "); }
	@Override
	public void click() { System.out.println(" Smart Phone clicking photo "); }
	@Override
	public void record() { System.out.println(" Smart Phone video recording "); }
	@Override
	public void play() { System.out.println(" Smart Phone playing music "); }
	@Override
	public void stop() { System.out.println(" Smart Phone stop music "); }
}

public class _02_Example_Interface{
	public static void main(String [] args)
	{
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.click();
		sp.play();
	}
}