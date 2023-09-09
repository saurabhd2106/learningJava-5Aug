package day3;

public class CountOfValuesInArray {
	
	public static void main(String[] args) {
		
		
		int[] arr = new int[10];
		
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;
		arr[3] = 0;
		arr[4] = 0;
		arr[5] = 1;
		arr[6] = 1;
		arr[7] = 1;
		arr[8] = 1;
		arr[9] = 0;
		
		int[] count = new int[2];
		
		for(int num: arr) {
			
			count[num]++;
		}
		
		System.out.println("Count of 0 is " + count[0] + " and count of 1 is "+ count[1]);
 	}

}
