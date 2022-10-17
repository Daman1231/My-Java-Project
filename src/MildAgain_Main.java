import java.util.Scanner;

public class MildAgain_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Milk Available or nor.. True/False");
		boolean available = sc.nextBoolean();
		MilkAgain again = new MilkAgain();
		//boolean milkoutput = again.milkavailable(available);
		again.milkavailable(available);
		System.out.println("The Milk is available " + available);

	}

}
