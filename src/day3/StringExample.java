package day3;

public class StringExample {
	
	public static void main(String[] args) {
		
		
		String str = "        My name is saurabh      ";
		
		System.out.println(str.length());
		
		str = str.trim();
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(17));
		
		System.out.println(str.toLowerCase().contains("my"));
		
		System.out.println(str);
		
		System.out.println(str.endsWith("saurabh"));
		
		String[] strArr = str.split(" ");
		
		for(String item: strArr) {
			System.out.println(item);
		}
		
		
	}

}
