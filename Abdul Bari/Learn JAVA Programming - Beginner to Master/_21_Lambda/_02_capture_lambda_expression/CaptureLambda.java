interface MyLambda{
	public void display();
}

class Demo{
	int temp = 10;
	public void method1(){
		MyLambda ml = () -> {
			System.out.println("Hello world!");
			System.out.println("Bye" + temp++);
		};
		ml.display();
	}
}

class UseLambda{
	public void callLambda(MyLambda ml){
		ml.display();
	}
}

class UseLambdaDemo{
	public void method2(){
		UseLambda ul = new UseLambda();
        // passing lambda expression as a parameter
		ul.callLambda(() -> { System.out.println("Hello"); });
	}
}

public class CaptureLambda {
    public static void main(String args[]){
		Demo d = new Demo();
		d.method1();

		UseLambdaDemo uld = new UseLambdaDemo();
		uld.method2();
	}
}
