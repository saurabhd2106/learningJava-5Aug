package day5;

public class BankApplication {
	
	static long accountId ;
	
	final String ORGNAME = "Uptut private limited";
	
	final int[] arr = new int[10];
	
	static {
		
		
		accountId = 6876456l;
		
	}
	
	private String name;
	
	public BankApplication(String name) {
		

	
		this.name = name;
		
		accountId++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountId() {
		return accountId;
	}
	
	public void withrawBalance(int balance) {
		
		System.out.println("Withdraw balance..");
	}
	
	public static String getOrganizationName() {
		
		String orgName = "Uptut Private Ltd";
		
		return orgName;
		
	}
	
	public final void someMethod() {
		System.out.println("Some execution");
	}
	
	

}
