package day21;

public class DemoEmployee {
	
	public static void main(String[] args) {
		
		Employee saurabh = new Employee();
		
		saurabh.setSalary(900000);
		
		System.out.println(saurabh.getSalary());
			
		saurabh.setBonus(80000);
		
		int saurabhSalary = saurabh.calculateSalary();
		
		System.out.println("Sauarbh Salary -> " + saurabhSalary);
		
		
	}

}


