package day5;

public class DemoBankAccount {

	public static void main(String[] args) {

		BankApplication user1 = new BankApplication("Saurabh");
		
		long accid = BankApplication.accountId;

		System.out.println(user1.getName());

		System.out.println(user1.getAccountId());

		BankApplication user2 = new BankApplication("Ganesh");

		System.out.println(user2.getName());

		System.out.println(user2.getAccountId());
		
		System.out.println(BankApplication.getOrganizationName());

	}

}
