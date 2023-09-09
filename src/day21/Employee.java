package day21;

public class Employee {

	private int salary;

	private int bonus;
	
	private int referalBonus;
	
	

	// Getters and Setters
	
	public int getReferalBonus() {
		return referalBonus;
	}

	public void setReferalBonus(int referalBonus) {
		this.referalBonus = referalBonus;
	}

	//Read access
	public int getSalary() {
		return this.salary;
	}
	
	public int getBonus() {
		return this.bonus;
	}

	
	//Write access
	public void setSalary(int salary) {

		if (salary > 0) {

			this.salary = salary;

		} else {
			System.err.println("Invalid salary");
		}

	}

	public void setBonus(int bonus) {

		if (bonus > 0) {

			this.bonus = bonus;

		} else {
			System.err.println("Invalid bonus");
		}

	}

	public int calculateSalary() {

		int totalSalary = salary + bonus;

		return totalSalary;

	}

}
