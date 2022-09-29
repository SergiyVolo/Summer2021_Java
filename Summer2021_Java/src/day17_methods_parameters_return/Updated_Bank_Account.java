package day17_methods_parameters_return;

public class Updated_Bank_Account {

	String name;
	double amount; 
	int accountNumber;
	String bankName;
	
	public void setBankAccount(int accountNum) {
		accountNumber = accountNum;
	} 
	
	public void deposit(double depositAmount) {
		amount = amount + depositAmount;
	}
	
	public void setName(String accountHolderName) {
		name = accountHolderName;
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
