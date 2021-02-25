import java.util.Scanner;

public class bankAccountTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
			System.out.println("please enter your start ballance ");
			double startBal = in.nextDouble();
			BankAccount myBankAccount = new BankAccount(startBal);

			System.out.println("how much would you like to withdrawl?");
			double withDrawAmount = in.nextDouble();
			BankAccount  myBankAccount = new withdraw(withDrawAmount);
			
			System.out.println ("how much would you like to deposit?");
			double depositAmount = in.nextDouble();
			bankAccount myBankAccount = new deposit(depositAmount);
			
			double finalBalance = myBankAccount
			System.out.println("your balance is now:" + finalBalance);
			
			
		
	}

}
