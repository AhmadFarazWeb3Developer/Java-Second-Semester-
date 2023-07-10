//  Car interface
interface Car {
	void funcCar();
}

//  Vehicle interface
interface Vehicle {
	void funcVehicle();
}

// Implement the Car and Vehicle interfaces in the Honda class
class Honda implements Car, Vehicle {

	public void funcCar() {
		System.out.println("I am Car");
	}

	public void funcVehicle() {
		System.out.println("I am Vehicle");
	}

	public void funcHonda() {
		System.out.println("I belong to both Car and Vehicle categories");
	}
}

// Main class to test the interfaces and classes
public class MainClass {

	public static void main(String[] args) {

		// Create a Vehicle object
		Vehicle vehicle = new Honda();
		vehicle.funcVehicle();

		// Create a Car object
		Car car = new Honda();
		car.funcCar();

		// Create a Honda object
		Honda honda = new Honda();
		
		// Call methods from Honda object
		honda.funcHonda();
		honda.funcCar();
		honda.funcVehicle();

	}

}
