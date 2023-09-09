package day2;

public class DemoEmployee {

	public static void main(String[] args) {

		Employee saurabh;

		// new -- instantiating an object (allocate memory)

		// Employee() -- initialising the object (default values to all the variables)
		saurabh = new Employee();

		saurabh.salary = 800000;

		saurabh.bonus = 700000;

		saurabh.calculateSalary();

		Employee gaurav = new Employee();

		gaurav.salary = 9857634;

		gaurav.bonus = 59867;

		int gauravSalary = gaurav.calculateSalary1();

		System.out.println("Gaurav salary - " + gauravSalary);

		// -----------------------

		Employee rahul = new Employee();

		int rahulSalary = rahul.calculateSalary2(546789, 5847678);

		System.out.println("Rahul's salary " + rahulSalary);

		// --------------------------

		Employee krish = new Employee();

		krish.salary = 5000000;

		krish.bonus = 4000000;

		int krishSalary = krish.calculateSalary(9000000, 800000);

		System.out.println("Krish salary - " + krishSalary);
		
		Employee raghav = new Employee(210000, 25000);
		
		raghav.calculateSalary();

	}

}
