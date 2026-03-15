import java.util.Scanner;

public class Simple_intrest {

	int p;
	final float r=5.0f;
	int t;
	
	float SI;
	
	void input() {		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the principal amount needed");
		p=s1.nextInt();
		System.out.println("enter the time in years");
		t=s1.nextInt();
	}
	
	void calculate() {
		
		SI=p*r*t/100;
	}
	
	void display() {
		System.out.println("Simple intrest is=>"+SI);
	}
	public static void main(String[] args) {
		Simple_intrest s1=new Simple_intrest();
		s1.input();
		s1.calculate();
		s1.display();

	}

}
