import java.util.Scanner;

public class MethodMain_License {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Current License: ");
		String inputLicense = sc.next();

		License_Method lm = new License_Method();
		String licenseToBeApplied = lm.license(inputLicense);

		switch (licenseToBeApplied) {
		case "G1":
			System.out.println("You have to pay $110 for " + licenseToBeApplied);
			break;
		case "G2":
			System.out.println("You have to pay $120 for " + licenseToBeApplied);
			break;
		case "G":
			System.out.println("You have to pay $130 for " + licenseToBeApplied);
			break;
		case "Drive Safe":
			System.out.println("You already have a license Drive Safe!");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}

	}

}
