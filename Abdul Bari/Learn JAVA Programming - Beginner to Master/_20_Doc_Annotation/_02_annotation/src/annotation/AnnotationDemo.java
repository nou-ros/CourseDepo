package annotation;
import java.lang.annotation.*;

class Parent{
	 public void display(){
		 System.out.println("Parent display");
	 };
}

class Child extends Parent{
	@Override
	public void display() {
		System.out.println("Child display");
	}
	
	@Deprecated
	public void show() {
		System.out.println("method show");
	}
}


class My<T>{
	@SafeVarargs
	private void show(T...arg) {
		for(T x:arg)
			System.out.println(x);
	}
}

@FunctionalInterface
// interface with one single method is where FunctionalInterface used
interface own{
	public void play();
}

@Retention(RetentionPolicy.CLASS)
@Documented
@Target(value= {ElementType.METHOD})
/**'
 * user defined annotation
 * @author yn
 * annotation are imported from import java.lang.annotation.Annotation;
 */
@interface MyAnno{
	String author();
	String project();
	String date();
	String version() default "11";
}


class UserAnnotation{
	@MyAnno(author="Nouros", project="User defined annotation", date="2022-01-08")
	public void method() {
		System.out.println("User defined Annotation Class");
	}
}

public class AnnotationDemo {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Child object = new Child();
		//object.show();
	}

}
