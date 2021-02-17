import java.util.Scanner;
public class mailMerge2 {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String replaceText1 = ("Dear <firstName> <lastName>,");
		String replaceText2 = ("Please confirm that your address is <houseNumber> <street>.");
		String replaceText3 = ("Your answer is: <yORn> Goodbye!");
		String promptText1 = ("Please enter your first name: ");
		String promptText2 = ("Please enter your last name: ");
		String promptText3 = ("Please enter your house number: ");
		String promptText4 = ("Please enter your street: ");
		String promptText5 = ("Is this address correct? ");

		System.out.print(promptText1);
		String fName = in.nextLine();
		System.out.print(promptText2);
		String lName = in.nextLine();
		System.out.print(promptText3);
		String hNumber = in.nextLine();
		System.out.print(promptText4);
		String street = in.nextLine();

		
		String replacement1 = replaceText1.replace ("<firstName>", fName);
		String line1 = replacement1.replace ("<lastName>", lName);
		String line2Replacement = replaceText2.replace ("<houseNumber>", hNumber);
		String line2 = line2Replacement.replace ("<street>", street);
		
		System.out.println("");
		System.out.println(line1);
		System.out.println(line2);
		
		System.out.print(promptText5);
		String correct = in.nextLine();
		
		String line3 = replaceText3.replace("<yORn>", correct);
		
		//System.out.println(line1);
		//System.out.println(line2);
		System.out.println(line3);
		
		
		
	}

}
