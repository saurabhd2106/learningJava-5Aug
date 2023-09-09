package day4;

public abstract class Shape {
	
	protected String color;
	
	public double calculateVolume( int side, int height) {
		
		color = "Blue";
	
		return calculateArea(side) * height ;
	}
	
	public abstract double calculateArea(int side);

}
