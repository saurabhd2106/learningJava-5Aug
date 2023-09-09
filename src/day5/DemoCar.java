package day5;

public class DemoCar {
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		
		
		Car alto = new Car();
		
		//Upcasting (Implicit)
		Vehicle veh = alto;
		
		
		//Downcasting (Explicit)
		
		if (v instanceof Car) {
			
			Car bmw = (Car) v;
			
		}
		
		
		
		
	}

}
