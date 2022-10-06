/* 7.	There is a water tank of capacity 100 litres. 
Water is filled into it using bucket which have capacity of 10 litres.  
Write a program which fills the tank to its capacity using these buckets.
Also include a mechanism in your program to stop the tank from over flowing*/

public class WaterTank_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int waterTankCapacity = 100;

		for (int bucket = 10; bucket <= 200; bucket += 10) {
			System.out.println("Water Tank filled with " + bucket + " bucket Capacity");
			if (bucket >= waterTankCapacity) {
				System.out.println("Water tank capacity reached");
				if (bucket > waterTankCapacity) {
					System.out.println("Water Tank OverFlowed");
				}
				break;
			}
		}

	}

}
