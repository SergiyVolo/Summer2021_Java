package day11_conditional_statements;

public class If_Else_Statements {

	public static void main(String[] args) {
		
		if(false != false) {
			System.out.println("inside if block");
		} else {
			System.out.println("inside else block");
		}
		
		int a = 100;
		
		if(a++ == 101) { // 100 == 101   memory: a = 101
//			a = 2000;
//			a = 5000;
			System.out.println("The value of a is " + a);
		} else {
			System.out.println("The value of a is " + a);
		}

			
		}

	}


