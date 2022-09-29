package day17_methods_parameters_return;

public class MyBank {
	
	public static void main(String[] args) {
		
Bank_Account account1 = new Bank_Account();
		
		account1.name = "John Doe";
		account1.amount = 200;
		account1.accountNumber = 12445563;
		account1.bankName = "Bank of America";
		
	
		System.out.println(account1.amount); 
		System.out.println("The name of the account holder is " + account1.name);
		System.out.println("The account number is " + account1.accountNumber);
		
		account1.deposit();   // + 500
		account1.pay();       // - 5
		account1.transfer();
		account1.withdraw();  // -200
		
		account1.printAccountInfo();
		
		account1.deposit();
		account1.printAccountInfo();
		
		// Instantiate a bank account object for Elon Musk 
		
		Bank_Account account2 = new Bank_Account();
		
		account2.name = "Elon Musk";
		account2.amount = 271_000_000_000d;
		account2.accountNumber = 34342234;
		account2.bankName = null;
		
		account2.pay();
		account2.withdraw();
		
		account2.printAccountInfo();

}
}
