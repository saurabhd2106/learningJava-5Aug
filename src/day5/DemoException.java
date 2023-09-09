package day5;

public class DemoException {

	public static void main(String[] args) {

		int[] arr = new int[5];

		try {
			arr[0] = 90;
			arr[1] = 60;
			arr[2] = 90;
			arr[3] = 20;
			arr[4] = 70;

			for (int i = 0; i <= 5; i++) {

				System.out.println(arr[i]);

			}
		} 

		catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();

			System.out.println("Array is breaking");

		} catch (StringIndexOutOfBoundsException e) {

			e.printStackTrace();

			System.out.println("String is breaking");
		}

		catch (Exception e) {
			
			
			e.printStackTrace();

		} finally {
			
			System.out.println("At the end I always execute");
			
		}

		System.out.println("After the array execution");

	}

}
