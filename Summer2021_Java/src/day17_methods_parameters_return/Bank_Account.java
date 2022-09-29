package day17_methods_parameters_return;

public class Bank_Account {
	
	String name;
	double amount;  // 0.0
	int accountNumber;
	String bankName;
	
	/*
	 * deposit
	 * withdraw
	 * pay
	 * transfer
	 * 
	 */
	
	public void deposit() {
		System.out.println("Depositing $500 to a bank account # " + accountNumber);
		
		amount += 500;
		// more logic can be provided if necessary
	}
	
	public void withdraw() {
		System.out.println("Withdrawing $200 from a bank account");
		amount -= 200;
	}
	
	public void transfer() {
		System.out.println("Tranferring money to another bank account");
	}
	
	public void pay() {
		System.out.println("Paying $5 for some product");
		amount -= 5;
	}
	
	public void printAccountInfo() {
		System.out.println("=====================================");
		System.out.println("The account holder: " + name);
		System.out.println("The available amount: " + amount);
		System.out.println("The account number: " + accountNumber);
		System.out.println("The bank: " + bankName);
		System.out.println("=====================================");
}
}
