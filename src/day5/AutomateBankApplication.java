package day5;

public class AutomateBankApplication {
	
	String account;
	
	public void openBrowser() {
		System.out.println("Opening a browser");
	}
	
	public void createAccount() throws ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException, Exception {
		

		int[] arr = new int[5];

			arr[0] = 90;
			arr[1] = 60;
			arr[2] = 90;
			arr[3] = 20;
			arr[4] = 70;

			
				for (int i = 0; i < 5; i++) {

					System.out.println(arr[i]);

				}
			
		
		System.out.println("create an account");
	}
	
	
	public void deleteAccount() throws Exception{
		
	
		
		if(account != null) {
			System.out.println("close account");
		} else {
			throw new Exception("Account doesnot exist..");
		}
		
		System.out.println("delete an account");
	}
	
	
	public void addBalance() {
		System.out.println("Add balance to your account");
	}
	
	public void withdrawMoney() {
		System.out.println("Withdraw money from your account");
	}

}
