
public class Revise_ObjectMain {

	public static void main(String[] args) {

		int actualFuel;
		Revise_Objects rangeRover = new Revise_Objects(50, 30, "Range_Rover");
		Revise_Objects Honda = new Revise_Objects(50, 30, "CRV");
		Revise_Objects Kia = new Revise_Objects(50, 30, "KIA");
		Revise_Objects Toyota = new Revise_Objects(50, 30, "Camry");
		Revise_Objects Jeep = new Revise_Objects(50, 30, "Wrangler");

		Revise_Objects vehicles[] = { rangeRover, Honda, Kia, Toyota, Jeep };
		for (int i = 0; i < vehicles.length; i++) {
			System.out.println(vehicles[i].vehicle);
		}

	}

}
