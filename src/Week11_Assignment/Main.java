package Week11_Assignment;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Simulation simulation = new Simulation();
		int rocket1Cost = simulation.runSimulation(simulation.loadU1(simulation.loadItem()));
		int rocket2Cost = simulation.runSimulation(simulation.loadU2(simulation.loadItem()));
		System.out.println("Total Cost For R1 Fleet $" + rocket1Cost + " Millions");
		System.out.println("Total Cost For R2 Fleet $" + rocket2Cost + " Millions");
	}

}
