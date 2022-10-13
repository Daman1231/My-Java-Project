/* 7.	There is a water tank of capacity 100 litres. 
Water is filled into it using bucket which have capacity of 10 litres.  
Write a program which fills the tank to its capacity using these buckets.
Also include a mechanism in your program to stop the tank from over flowing*/

public class WaterTank_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int waterTankCapacity = 100;
		int watertankfilled = 96;
		int bucket1 = 10;
		int watertankmaxfilledcapacity = 95;
		while (watertankfilled < waterTankCapacity) {
			if (watertankfilled >= watertankmaxfilledcapacity) {
				System.out.println("water tank capacity reached");
				break;
			}
			watertankfilled += bucket1;
			if (watertankfilled > watertankmaxfilledcapacity) {
				int lastfilledbucket = (watertankfilled - (watertankmaxfilledcapacity));
				watertankfilled -= lastfilledbucket;
			}
			System.out.println("Tank size" + watertankfilled);
		}
	}

}
