package day3;

public class ArraysExamples {
	
	public static void main(String[] args) {
		
		
		int[] nums = {15, 23, 58, 98};
		
		int[] arr = new int[5];
		
		arr[0] = 90;
		arr[1] = 12;
		arr[0] = 190;
		arr[1] = 112;
		arr[0] = 91;
		
		
		
		System.out.println(nums[3]);
		
		for(int i=0; i< nums.length; i++) {
			
			System.out.println(nums[i]);
			
		}
		
		
		for(int item : nums) {
			
			System.out.println("number - " + item);
			
		}
		
	}

}
