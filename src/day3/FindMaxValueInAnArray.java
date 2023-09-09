package day3;

public class FindMaxValueInAnArray {

	public static void main(String[] args) {
		int[] arr = new int[5];

		arr[0] = 90;
		arr[1] = 12;
		arr[2] = 190;
		arr[3] = 112;
		arr[4] = 91;
		
		int max = arr[0];
		int min = arr[0];
		
		for(int num: arr) {
			
			if(num > max) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
			
		}
		
		System.out.println("Maximum value is - " + max);
		
		System.out.println("Minimum value is - " + min);
	}

}
