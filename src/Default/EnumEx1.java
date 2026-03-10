package Default;

enum Result
{
	PASS,FAIL,NA;//it is Result type and inside that i have created a 3 constant 
				 // internally it will, create a class of each constant
				// eg: public static Result PASS=new Result();
	int age;
	Result(){
		System.out.println("Enum constructor");
	}
	{
		System.out.println("block");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class EnumEx1 {

	public static void main(String[] args) {
	
		Result res = Result.FAIL;
		System.out.println(res);
	}

}
