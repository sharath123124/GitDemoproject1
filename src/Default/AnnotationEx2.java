package Default;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD})
@interface Cricketer
{
	String country() default "india";
}

class Dhoni{
	
	@Cricketer(country="india")
	int age;
	
	@Cricketer
	Dhoni(){
		System.out.println("Dhoni const");
	}
//	@Cricketer  error
	void test() {
		System.out.println("he rataired at 38");
	}
}
public class AnnotationEx2 {

	public static void main(String[] args) 
	{
		Dhoni d1=new Dhoni();
		Class<? extends Dhoni> ref = d1.getClass();
		Cricketer ann = ref.getAnnotation(Cricketer.class);
		

	}

}
