package day21;

public class DemoCar {
	
	public static void main(String[] args) {
		
		Machine mac = new Machine("mac type");
		
		mac.startEngine();

		System.out.println("---------------------------------");

		Car alto = new Car();
		
		alto.startEngine();
		
		alto.rotateWheel();
		
		
		System.out.println("---------------------------------");

		Machine nexon = new Car();
		
		nexon.startEngine();
		
		

	}

}
