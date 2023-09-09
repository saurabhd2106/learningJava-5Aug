package day4;

public class DemoShape {

	public static void main(String[] args) {

		Shape cyl = new Cylinder();
		
		cyl.color = "RED";

		double vol = cyl.calculateVolume(10, 12);

		System.out.println("Volume of cylinder - " + vol);

		Cuboid cuboid = new Cuboid();

		double cubVol = cuboid.calculateVolume(10, 12);

		System.out.println("Volume of Cuboid - " + cubVol);
		
		

	}

}
