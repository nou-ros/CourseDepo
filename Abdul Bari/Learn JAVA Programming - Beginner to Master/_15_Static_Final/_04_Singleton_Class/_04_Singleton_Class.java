class CoffeeMachine{
	private float coffee;
	private float water;
	private float milk;
	private float sugar;
	
	static private CoffeeMachine cm = null;
	// With counter i can only create 5 object 
	//static private int count = 0;
	
	private	CoffeeMachine()
	{
		coffee = 1;
		water = 1;
		milk=1;
		sugar=1;
	}
	
	static public CoffeeMachine getInstance()
	{
		if(cm==null)
		//if(cm==null || count<5)
		{
			cm=new CoffeeMachine();
			//count++;
		}
		return cm;
	}
	public void fillWater(float qty)
	{
		water = qty;
	}
	public void fillSugar(float qty)
	{
		sugar=qty;
	}
	public float getCoffee()
	{
		return 0.23f;
	}
}

public class _04_Singleton_Class{
	public static void main(String [] args)
	{
		CoffeeMachine m1 = CoffeeMachine.getInstance();
		CoffeeMachine m2 = CoffeeMachine.getInstance();
		CoffeeMachine m3 = CoffeeMachine.getInstance();
		// To check the 5 object counter mechanism
		//CoffeeMachine m4 = CoffeeMachine.getInstance();
		//CoffeeMachine m5 = CoffeeMachine.getInstance();
		//CoffeeMachine m6 = CoffeeMachine.getInstance();
		
		System.out.println(m1+" "+m2+" "+m3);
		//System.out.println(m1+" "+m2+" "+m3+" "+m4+" "+m5+" "+m6);
		if(m1==m2 && m1==m3)
			System.out.println("Same");
		
	}
}