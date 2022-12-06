package PracticeQuestions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		for(int i = num; i > 0; i--) {
			fact = fact * i;
		}
		 System.out.println(fact);

	}

}
