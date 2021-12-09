import java.lang.*;

class Product{
	private String itemNo;
	private String name;
	private double price;
	private int qty;
	
	public Product(String itemNo)
	{
		this.itemNo=itemNo;
	}
	public Product(String itemNo, String name)
	{
		this.itemNo=itemNo;
		this.name=name;
	}
	public Product(String itemNo, String name, double price, int qty)
	{
		this.itemNo=itemNo;
		this.name=name;
		setPrice(price);
		setQty(qty);
	}
	public String getItemNo(){ return itemNo; }
	public String getName(){ return name; }
	public double getPrice(){ return price; }
	public int getQty(){ return qty; }
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public void details()
	{
		System.out.println(getItemNo()+":"+getName()+", price: "+getPrice()+" and quantity: "+getQty());
	}
}		

class Customer
{
	private String custId;
	private String name;
	private String address;
	private String phone;
	public Customer(String custId, String name)
	{
		this.custId=custId;
		this.name=name;
	}
	public Customer(String custId, String name, String address, String phone)
	{
		this.custId=custId;
		this.name=name;
		setAddress(address);
		setPhone(phone);
	}

	public String getCustId(){ return custId; }
	public String getName() { return name; }
	public String getAddress() { return address; }
	public String getPhone() { return phone; }
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setPhone(String phone)
	{
		this.phone=phone;
	}
	public void details()
	{
		System.out.println(getCustId()+":"+getName()+", address: "+getAddress()+" and phone: "+getPhone());
	}
}

public class _08_Challenge_05{
	public static void main(String [] args)
	{
		Product p = new Product("#1","First Product",12.75,5);
		p.details();
		Customer c = new Customer("01","Nouros");
		c.details();
	}
}