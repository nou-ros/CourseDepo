class ATM{
	synchronized public void checkBalance(String name){
		System.out.println(name + " checking ");
		try{ Thread.sleep(1000); }catch(Exception e){}
		System.out.println("Balance");
	}

	synchronized public void withDraw(String name, double amount){
		System.out.println(name + " withdrawing ");
		try{ Thread.sleep(1000); }catch(Exception e){}
		System.out.println(amount);
	}
}

class Customer extends Thread{
	ATM atm;
	String name;
	double amount;

	Customer(String name, ATM a, double amount){
		atm = a;
		this.name = name;
		this.amount = amount;
	}

	public void useATM(){
		atm.checkBalance(name);
		atm.withDraw(name, amount);
	}

	public void run(){
		useATM();
	}
}

public class Challenge{
	public static void main(String args[]){
		ATM atm = new ATM();
		Customer gin = new Customer("Gin", atm, 1200);
		Customer tama = new Customer("Tama", atm, 1100);
		
		gin.start();
		tama.start();
	}
}
