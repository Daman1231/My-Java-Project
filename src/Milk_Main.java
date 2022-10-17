import java.util.Scanner;

public class Milk_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the milk is available or not, True/False");
		boolean available = sc.nextBoolean();
		// TODO Auto-generated method stub
		Milk milk = new Milk();
		milk.isMilkAvailable(available);
		

		System.out.println("Milk is available " + available);

	}

}
