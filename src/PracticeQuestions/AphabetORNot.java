package PracticeQuestions;

import java.util.Scanner;

public class AphabetORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet of Your Choice");
		char alphabet = sc.next().charAt(0);
		if (Character.isAlphabetic(alphabet)) {
			System.out.println(alphabet + " is an Alphabet");
		} else {
			System.out.println(alphabet + " is not an Alphabet");
		}
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter an Alphabet of Your Choice");
		char alph = sc.next().charAt(0);
		if(Character.isAlphabetic(alph)) {
			System.out.println("Aplhabet");
		}
		else {
			System.out.println("No");
		}

		
		
		
	}

}
