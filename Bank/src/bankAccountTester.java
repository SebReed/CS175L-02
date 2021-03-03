import java.util.Scanner;

public class bankAccountTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
			System.out.println("Please enter your start balance ");
			double startBal = in.nextDouble();
			BankAccount myBankAccount = new BankAccount(startBal);

			System.out.println("Enter the interest rate for this account:");
			double interestAmount = in.nextDouble();
			BankAccount.interest(interestAmount);
			
			System.out.println ("How much would you like to deposit?");
			double depositAmount = in.nextDouble();
			myBankAccount.deposit(depositAmount);		
			
			
			System.out.println("How much would you like to withdraw?");
			double withDrawAmount = in.nextDouble();
				if(withDrawAmount < myBankAccount):
					System.out.println("InSufficient Funds to support withdrawal");
				else();
					System.out.ptintln("Your account balance is now:" + myBankAccount.getBalance());
			myBankAccount.withdraw(withDrawAmount);
			
			System.out.println("How much would you like to withdraw?");
			double withDrawAmount = in.nextDouble();
				if(withDrawAmount < myBankAccount) {
					System.out.println("InSufficient Funds to support withdrawal");
				}
					else(){
					System.out.ptintln("Your account balance is now:" + myBankAccount.getBalance());
					}
					myBankAccount.withdraw(withDrawAmount);
			
			System.out.println("If you would like to generate interest, enter yes:")
			String yesOrNo = in.nextDouble
				if(yes == yes) {
					System.out.print("Interest:" + get.interest());
				}
				else {
					sytem.out.print ("okay"); 
				}
			
			double finalBalance = myBankAccount
			System.out.println("Your balance is now:" + myBankAccount.getBalance();
			
			
			
			
			
			
	}

}
