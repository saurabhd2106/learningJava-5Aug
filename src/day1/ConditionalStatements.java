package day1;

public class ConditionalStatements {
	
	public static void main(String[] args) {
		
		
		int number = 12;
		
		if(number >= 10) 
		
		{
			System.out.println("Greater than or equal to 10");
		} 
		
		else 
		{
			System.out.println("Less than 10");
		}
		
		// Greatest out of two number 
		
		int firstNumber = -45;
		int secondNumber = -4;
		
		if(firstNumber > secondNumber) {
			System.out.println("First number is greater");
		} else if(firstNumber == secondNumber) {
			System.out.println("Both are equal");
		}
		
		else {
			System.out.println("Second Number is greater");
		}
		
	}

}
