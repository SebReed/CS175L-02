import javax.swing.JOptionPane;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String birthday = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY)");
		String date = JOptionPane.showInputDialog("Enter todays date (MM/DD/YYYY)");

		
		String birthMonth = birthday.substring(0,2);
		String birthDay = birthday.substring(3,5);
		String birthYear = birthday.substring(6, 10);
		
		String currentMonth = date.substring(0,2);
		String currentDay = date.substring(3,5);
		String currentYear = date.substring(6, 10);
		
		int days = Integer.parseInt(currentDay);
		int months = Integer.parseInt(currentMonth);
		int years = Integer.parseInt(currentYear);

		int bdays = Integer.parseInt(birthDay);
		int bmonths = Integer.parseInt(birthMonth);
		int byears = Integer.parseInt(birthYear);
		
		days = days - bdays ;
		months = months - bmonths ;
		years = years - byears ;
		
		if (months < 0) {
			years--;
			months = months + 12; }
		
		if (days < 0) {
			months--;
			days = days + 31; }
		
		
		System.out.print("You are about: " + years +" years " + months + " months and " + days + " days old");
	}
	
}
