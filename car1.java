
public class car1 {

	public static void main(String[] args) {
		Car car = new Car();
		car.printData();
	}
}

class Car {

	public boolean accelerate;
	public String brand;
	public String model;
	public int amountofFuel;

	public Car() {
		accelerate = true;
		brand = "Kia";
		model = "Rio";
		amountofFuel = 2;
	}

	public void brake() {
		accelerate = false;
		System.out.println("Car is breaking");

	}

	public void accelerate() {
		accelerate = true;
		if (amountofFuel > 0) {
			System.out.println("Car is accelerating");
			amountofFuel--;
		}
	}

	public void printData() {
		System.out.println("Brand:" + brand);
		System.out.println("Model:" + model);
		System.out.println("Fuel:" + amountofFuel);
	}
}
