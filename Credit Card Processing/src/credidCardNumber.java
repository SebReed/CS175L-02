import java.util.Scanner;

public class credidCardNumber {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		
		int i=0;
		
		
		while( i != -99) {
			System.out.println("please enter your credit card number or +99 to end:");
			String creditCardNumber=in.nextLine();
				if(creditCardNumber == "-99") {
					i=-99;
				}
			System.out.println(creditCardNumber.replace('-', ''));
			
		}
		
		
		
		}

}
