import java.util.Scanner;

public class bankAccountTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BankAccount myBankAccount = new BankAccount(balance, intPct);
			System.out.println("Please enter your start balance ");
			double balance = in.nextDouble();
			System.out.println("Enter the interest rate for this account");
			double intPct = in.nextDouble();
			System.out.print("Enter amount to deposit:");
			double x = in.nextDouble();
			System.out.print("Enter amount to withdraw:");
			double y = in.nextDouble();

			
			myBankAccount.deposit(x);
			myBankAccount.withdraw(y);
			myBankAccount.interest(intPct);
			myBankAccount.getBalance();
			//Also in tester this code:
			System.out.println("If you would like to generate interest, enter yes:");
			String answer = in.nextString;
			if(answer == "yes") {
			System.out.print("Interest:" + myBankAccount.interest(intPct));
			}
	}}
			
