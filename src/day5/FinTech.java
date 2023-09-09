package day5;

public class FinTech extends BankApplication {

	public FinTech(String name) {
		super(name);

	}

	@Override
	public void withrawBalance(int balance) {

		System.out.println("Withdraw balance..");
	}

	
}
