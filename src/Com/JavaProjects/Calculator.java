package Com.JavaProjects;

import java.util.Scanner;

class Calsi
{
	int res;
	void addition(int num1 , int num2) 
	{
		res=num1+num2;
		System.out.println("Addition of 2 number is =>"+res);
	}
	void sutraction(int num1 , int num2) 
	{
		res=num1*num2;
		System.out.println("sutraction of 2 number is =>"+res);
	}
	void multiplication(int num1 , int num2) 
	{
		res=num1+num2;
		System.out.println("multiplication of 2 number is =>"+res);
	}
	void division(int num1 , int num2) 
	{
		res=num1/num2;
		System.out.println("division of 2 number is =>"+res);
	}
	
	
}
public class Calculator {	

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculator application");
		System.out.println("Enter the first number");
		int number1=sc.nextInt();
		System.out.println("Enter the secong number");
		int number2=sc.nextInt();
		Calsi c1 =new Calsi();
		c1.addition(number1, number2);
	}

}
