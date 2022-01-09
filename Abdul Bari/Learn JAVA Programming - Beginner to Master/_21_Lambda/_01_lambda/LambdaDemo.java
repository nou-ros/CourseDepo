
@FunctionalInterface
interface MyLambda{
//	public void display(String name);
	public int add(int x, int y);
}

public class LambdaDemo {
    public static void main(String args[]) {
		// Anonymous inner class
//		MyLambda m = new MyLambda() {
//			public void display() {
//				System.out.println("hello world");
//			}
//		};
		
		// Anonymous function or lambda expression method
//		MyLambda t =  (name) -> { System.out.println("Hello World " + name); };
//		t.display("Nouros");
		
		MyLambda param = (a, b) -> a + b;
		int res = param.add(20, 30);
		System.out.println(res);
	}
}
