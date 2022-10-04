import java.util.Scanner;

/*
 * 
 * 4.	Ontario license authority checks for two things to issue a license, 
 * first is the age of person and the current level (G1 or G2 or G) . 
 * Assume different values for these two values and write code which will print, 
 * whether license will be issued to the person or not and if the license is issued, 
 * which type of license the person will get i.e.
 *  whether he will get a G1 or G2 or G.
 * 
 */
public class Ontatio_License {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 50;
		String CurrentLevel = "G1";

		if (age == 16 && CurrentLevel == " ") {
			System.out.println("G1 License will be issued.");
		} else if (age > 16 && age <= 18 && CurrentLevel == "G1") {
			System.out.println("G2 License will be issued.");
		} else if (age > 18 && CurrentLevel == "G2") {
			System.out.println("G License will be issued.");
		} else if (age > 18 && CurrentLevel == "G1") {
			System.out.println("G2 License will be issued");
		} else if (age > 18 && CurrentLevel == "G") {
			System.out.println("Congratulation! You already have a license");
		} else if (age > 18 && CurrentLevel == " ") {
			System.out.println("G1 License will be issued");
		} else if (age == 16 && CurrentLevel == "G1" || CurrentLevel == "G2" || CurrentLevel == "G") {
			System.out.println("Invalid Current Level,because age 16 is a minumum age for G1 Eligibility.");
		}

		else {
			System.out.println("The Valid Age for license must be atleast 16.");
		}

	}
}

//		int age = 0;
//
//		boolean b = false;
//		while (!b) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter Your Age Here: ");
//			age = sc.nextInt();
//
//			if (age == 18) {
//				System.out.println("Valid Age for G1 License");
//			} else if (age <= 18) {
//				System.out.println("Invalid Age for License");
//
//			} else if (age >= 19 && age <= 20) {
//				System.out.println("Valid age for G2 License");
//			} else if (age >= 20 ) {
//				System.out.println("Valid age for G License");
//			}
//			
//			
//		}

// }
//}
