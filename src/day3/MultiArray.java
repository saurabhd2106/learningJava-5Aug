package day3;

public class MultiArray {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][2];
		
		arr[0][0] = 10;
		arr[0][1] = 12;
			
		arr[1][0] = 11;
		arr[1][1] = 18;
		
		arr[2][0] = 15;
		arr[2][1] = 17;
		
		for(int row=0; row < arr.length; row++) {
			for(int col=0; col < arr[0].length; col++) {
				
				System.out.print(arr[row][col] + "  ");
				
			}
			
			System.out.println();
		}
		
		for(int[] nums: arr) {
			
			for(int item: nums) {
				
				System.out.print(item + "  ");
			}
			
			System.out.println();
			
		}
		
		
	}

}
