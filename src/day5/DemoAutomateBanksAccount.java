package day5;

public class DemoAutomateBanksAccount {
	
	public static void main(String[] args) {
		
		
		AutomateBankApplication bankApplication = new AutomateBankApplication();
		
		try {
			bankApplication.openBrowser();
			
			
			
			bankApplication.createAccount();
			
			bankApplication.addBalance();
			
			bankApplication.withdrawMoney();
			
			bankApplication.deleteAccount();
			
			
		} catch (Exception e) {
			System.out.println("Notify user...");
			e.printStackTrace();
		}
	}

}
