import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int hLength= 0;
		int hWidth = 0;
		int hHeight = 0;
		int nDoors = 0;
		int nWindows = 0;
		double wDoors = 0;
		double hDoors = 0;
		double wWindows = 0;
		double hWindows = 0;
		double SqFtCost = 0;
		double overallSqFeet = 0;
		double sqFeetDoors = 0;
		double sqFeetWindows = 0;
		double sqFeetNeeded = 0;
		double costToPaint = 0;

		System.out.println("Enter length of house:");
		hLength = in.nextInt();
		System.out.println("Enter width of house:");
		hWidth = in.nextInt();
		System.out.println("Enter height of house");
		hHeight = in.nextInt();
		System.out.println("Enter number of doors");
		nDoors = in.nextInt();
		System.out.println("Enter number of windows");
		nWindows = in.nextInt();
		System.out.println("Enter the height of the windows");
		hWindows = in.nextDouble();
		System.out.println("Enter the width of the windows");
		wWindows = in.nextDouble();
		System.out.println("Enter the height of the doors");
		hDoors = in.nextDouble();
		System.out.println("Enter the width of the doors");
		wDoors = in.nextDouble();
		
		overallSqFeet = (2 * hLength * hWidth + (hLength * (hHeight - hWidth)) + 2 *(hLength * hWidth));
		sqFeetDoors = (nDoors * (wDoors * hDoors));
		sqFeetWindows = (nWindows * (wWindows * hWindows));
		sqFeetNeeded = (overallSqFeet - sqFeetDoors - sqFeetWindows);
		
		System.out.print("/nEnter cost per square foot: ");
		SqFtCost = in.nextDouble();
		
		costToPaint = (sqFeetNeeded * SqFtCost);
		System.out.print("The cost to paint the house is " + costToPaint);
		
	}

}
