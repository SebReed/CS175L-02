import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class RoachSimulation {
	public static void main(String[] args)
	   {

	    
		String roachPopulation = JOptionPane.showInputDialog("initial roach population");
	    Double population = Double.parseDouble(roachPopulation);
	    	   
	    RoachPopulation Roaches = new RoachPopulation (population);
	    
	    System.out.println("the initial roach population is" + Roaches.getRoaches());
	    Roaches.breed ();	 
	    System.out.println("the Roach population after cycle 1 breeding is "+ Roaches.getRoaches());
	    Roaches.spray (0.5);
	    System.out.println("the Roach population after cycle 1 of 50 percent spray is " + Roaches.getRoaches());
	    Roaches.breed ();	
	    System.out.println("the Roach population after cycle 2 breeding is "+ Roaches.getRoaches());
	    Roaches.spray (0.6);
	    System.out.println("the Roach population after cycle 2 of 60 percent spray is " + Roaches.getRoaches());
	    Roaches.breed ();	
	    System.out.println("the Roach population after cycle 3 breeding is "+ Roaches.getRoaches());
	    Roaches.spray (0.7);
	    System.out.println("the Roach population after cycle 3 of 70 percent spray is " + Roaches.getRoaches());
	    Roaches.breed ();
	    System.out.println("the Roach population after cycle 4 breeding is "+ Roaches.getRoaches());
	    Roaches.spray (0.8);
	    System.out.println("the Roach population after cycle 4 of 80 percent spray is " + Roaches.getRoaches());
	    

	   }
}
