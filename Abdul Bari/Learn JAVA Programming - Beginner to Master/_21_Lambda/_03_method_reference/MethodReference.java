@FunctionalInterface
interface MyLambda{
	public void display(String str);

	//public int display(String str1, String str2);
}


public class MethodReference{
	public static void reverse(String str){
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}

	public void rever(String str){
		StringBuffer sbf = new StringBuffer(str);
		sbf.reverse();
		System.out.println(sbf);
	}

	/*
	 public MethodReference(String s){
		System.out.println(s.toUpperCase());
	}*/

	public static void main(String args[]){
		MyLambda ml = System.out::println;
		ml.display("Hello");

		MyLambda ml2 = MethodReference::reverse;
		ml2.display("Hello");

		MethodReference  mr = new MethodReference();
		MyLambda ml3 = mr::rever;
		ml3.display("world");

		//MyLambda ml4 = MethodReference::new;
		//ml4.display("Luffy");
		
		//MyLambda ml5 = String::compareTo;
		//System.out.println(ml5.display("hello","hello"));

	}
}
