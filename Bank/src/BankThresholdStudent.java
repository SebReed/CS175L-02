import java.util.Scanner;

public class BankThresholdStudent {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter Initial balance: ");
		int balance = in.nextInt();
		System.out.println("enter Interest percentage: ");
		double intPct = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(balance, intPct);
		
		System.out.println("enter threshold for your account balance to reach or 'End': ");
		double threshold = in.nextDouble();
		months = 0;
		while (myBankAccount.getBalance()< threshold) {
			months++;
			myBankAccount.interest();
		}
		System.out.println(months);
		
		
		
	}
}
