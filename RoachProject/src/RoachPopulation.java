import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class RoachPopulation {
	
	int population = 10;
	double sprayPercentage = 0;
	int currentRoaches = 0;
	int roaches = 0;
	
	public void breed (int population) {
		this.population = 2 * population;
	}
	
	
	int getPopulation() {
		return population;
	}
	
	public void spray (int percent) {
		
		roaches = percent * population;
	}
	double currentRoaches() {
		return roaches;
		
	}

	
	
	public static void main(String[] args)
	   {

	    
		String roachPopulation = JOptionPane.showInputDialog("initial roach population");
	    Double population = Double.parseDouble(roachPopulation);
	    
	   
	    RoachPopulation killed1 = new RoachPopulation ();
	    RoachPopulation killed2 = new RoachPopulation ();
	    RoachPopulation killed3 = new RoachPopulation ();
	    RoachPopulation killed4 = new RoachPopulation ();
	    
	    killed1.spray (50);
	    killed2.spray (60);
	    killed3.spray (70);
	    killed4.spray (80);
	    
	    
	    System.out.println("the initial roach population is" + killed1.getPopulation());
	    System.out.println("the Roach population after cycle 1 breeding is "+ killed1.currentRoaches());
	    System.out.println("the Roach population after cycle 1 of 50 percent spray is " + killed2.getPopulation());
	    System.out.println("the Roach population after cycle 2 breeding is "+ killed2.currentRoaches());
	    System.out.println("the Roach population after cycle 2 of 60 percent spray is " + killed3.getPopulation());

	    System.out.println("the Roach population after cycle 3 breeding is "+ killed3.currentRoaches());
	    System.out.println("the Roach population after cycle 3 of 70 percent spray is " + killed4.getPopulation());

	    System.out.println("the Roach population after cycle 4 breeding is "+ killed4.currentRoaches());
	    System.out.println("the Roach population after cycle 4 of 80 percent spray is " + killed4.getPopulation());


	   }
}
