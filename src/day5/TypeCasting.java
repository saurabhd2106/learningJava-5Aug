package day5;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		
		
		//Widening Casting (Implicit type casting)
		
		int num = 84535;
		
		long lNumber = num;
		
		double dNumber = num;
		
		System.out.println(lNumber);
		
		
		//Narrowing type casting or Explicit Type casting
		
		long l1Number = 87455165165l;
		
		int num1 = (int) l1Number;
		
		System.out.println(num1);
		
	}

}
