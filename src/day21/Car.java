package day21;

public class Car extends Machine {

	int steeringWheel;
	
	public Car() {
		
		super("Car type");
		
		System.out.println("Car constructors...");
	}

	public void rotateWheel() {
		System.out.println("Rotate wheel");
	}

	@Override
	public void startEngine() {

		System.out.println("CAR -- Start the engine");

	}
	
	
	public void startEngine(String wheelType) {

		System.out.println("CAR -- Start the engine");

	}
	
}
