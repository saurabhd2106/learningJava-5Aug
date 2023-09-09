package day2;

public class Employee {
	
	
	//Implicit constructor
	
	public Employee(){
		
		salary = 40000;
		
		bonus = 30000;
		
	}
	
	
	//Explicit constructor
	public Employee(int salary, int bonus) {
		
		this.salary = salary;
		
		this.bonus = bonus;
		
	}

	// State

	int salary;

	int bonus;

	// Behaviour

	public void calculateSalary() {

		int totalSalary = salary + bonus;

		System.out.println("Total salary - " + totalSalary);

	}

	public int calculateSalary1() {

		int totalSalary = salary + bonus;

		return totalSalary;

	}

	public int calculateSalary2(int sal, int bon) {

		int totalSalary = sal + bon;

		return totalSalary;

	}

	public int calculateSalary(int salary, int bonus) {

		int totalSalary = salary + bonus;

		return totalSalary;

	}
	
	

}
