import java.lang.*;

abstract Member
{
	abstract void callback();
}

class Customer extends Member
{
	String name;
	Customer(String name)
	{
		this.name=name;
	}
	
	@Override
	public void callback(){
		System.out.println("Ok I will visit, " + name);
	}
}

class Store
{
	Member mem[] = new Member[100];
	int count = 0;
	
	void register(Member m)
	{
		mem[count++] = m;
	}
	
	void inviteSale()
	{
		for(int i=0;i<count;i++)
			mem[i].callback();
	}
}

public class _03_Challenge
{
	public static void main(String [] args)
	{
		Store s = new Store();
		Member m[] = new Member[100];
		Customer c1 = new Customer("John");
		Customer c2 = new Customer("Mark");
		m[0] = new Customer("Hola!");
		//m[1] = new Member();
		s.register(m[0]);
		s.register(c2);
	
		s.inviteSale();
	}
}