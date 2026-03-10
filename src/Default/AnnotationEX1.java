package Default;


class alpha
{
	void displaymethos() {
		System.out.println("parent class method");
	}
	
}


class beta extends alpha
{
	//Override //it will not go to compiler
	@Override //this message will go to compiler 
//	void displaymetho() {
	void displaymethos() {
		System.out.println("child class method");
	}
}
public class AnnotationEX1 {

	public static void main(String[] args) {
	
		alpha a1=new beta();
		a1.displaymethos();//it should display child method but why it displaying parent method because of splling mistake
	}

}
