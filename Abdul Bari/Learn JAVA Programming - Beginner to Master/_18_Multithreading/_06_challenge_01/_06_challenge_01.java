class Atm{

	synchronized public void checkBalance(String name)
		{
			System.out.println(name + " is checking");
			try{Thread.sleep(1000);}catch(Exception e){}
			System.out.println("Balance");
		}
		
	synchronized public void withdraw(String name, int amount)
		{
			System.out.println(name + " is withdrawing");
			try{Thread.sleep(1000);}catch(Exception e){}
			System.out.println(amount);
		}
}

class Customer extends Thread{
	Atm atm;
	String name;
	int amount;
	
	public Customer(String name, int amount, Atm atm)
	{
		this.name = name;
		this.amount = amount;
		this.atm = atm;
	}
	
	public void useATM()
	{
		atm.checkBalance(name);
		atm.withdraw(name, amount);
	}
	
	public void run()
	{
		useATM();
	}
	
}

public class _06_challenge_01{
	public static void main(String args[])
	{
		Atm a = new Atm();
		Customer c1 = new Customer("Bob", 500, a);
		Customer c2 = new Customer("Gig", 300, a);
		c1.start();
		c2.start();
	}
}