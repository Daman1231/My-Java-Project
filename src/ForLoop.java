
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxCapacity = 10; // this is a maximum drink capacity

		for (int drinktaken = 1; drinktaken <= maxCapacity; drinktaken++) {
			System.out.println("Drunk a wiskey " + drinktaken + " time");
			if (drinktaken == maxCapacity) {
				System.out.println("Now you have reached the maximum drinking capacity");
				//break;
			}

		}
	}
}
