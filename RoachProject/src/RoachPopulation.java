import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class RoachPopulation {
	
	private double population = 0;

	public RoachPopulation (double pop) {
		population = pop;
	
	}
	
	
	
	public void breed () {
		this.population = 2 * population;
	}
	
	
	public double getRoaches() {
		return population;
	}
	
	public void spray (double percent) {
		
		this.population = population - (percent * population);
	}


}
