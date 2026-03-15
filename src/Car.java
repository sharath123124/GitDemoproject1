
public class Car {

	String make,model,year;
	
	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(String year) {
		this.year = year;
	}

	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
	}

	public static void main(String[] args)
	{
		Car c1=new Car();
		c1.setMake("Toyota");
		c1.setModel("Corolla");
		c1.setYear("2020");
		
		System.out.println(c1);
	
		Car c2=new Car();
		c2.setMake("Honda");
		c2.setModel("Civic");
		c2.setYear("2022");
		System.out.println(c2);
	}

}
