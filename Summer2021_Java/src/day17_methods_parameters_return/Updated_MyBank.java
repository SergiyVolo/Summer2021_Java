package day17_methods_parameters_return;

public class Updated_MyBank {

	public static void main(String[] args) {
		
Updated_Bank_Account account1 = new Updated_Bank_Account();
		
		int accountNum = 124434332;
		
//		account1.setBankAccount(accountNum); // ?
		account1.setBankAccount(124434332); // ?
		account1.deposit(500);
		account1.setName("Jeff Bezos");
		
		account1.printAccountInfo();
		
	}

}
