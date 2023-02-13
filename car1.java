
public class car1 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.printData();
		car1.accelerate();
		car1.brake();
		car1.printData();
		car1.refuel(5);
		
		Car car2 = new Car("Fait","200",10,"Yellow");
		car2.printData();
		
		Car car3 = new Car("Hyundai","i20",30,"Red");
		car3.printData();
	}
}
//crerate car class
class Car {

	public boolean accelerate;
	public String brand;
	public String model;
	public int amountofFuel;
	public String color;


	//Default Constructor
	public Car() {
		accelerate = true;
		brand = "Kia";
		model = "Rio";
		amountofFuel = 20;
		color="Black";
	}
	
	//Parameterized constructor
	public Car (String brand, String model,int amountofFuel,String color) {
		accelerate = true;
		this.brand=brand;
		this.model=model;
		this.amountofFuel=amountofFuel;
	}

	public void brake() {
		accelerate = false;
		System.out.println("Car is breaking");

	}
//accerlerate method 
	public void accelerate() {
		accelerate = true;
		if (amountofFuel <= 0) {
			accelerate=false;
		}
	}
	
	public void refuel(int amount)
	{
		System.out.println("Fuel on the tank: "+ amountofFuel);
		System.out.println("Refuel: " +amount);
		System.out.println("Fuel on the tank after tthe refuel: " + (amountofFuel+amount));
	}
	


	public void printData() {
		System.out.println("Brand:" + brand);
		System.out.println("Model:" + model);
		System.out.println("Fuel:" + amountofFuel);
	
	}
}
