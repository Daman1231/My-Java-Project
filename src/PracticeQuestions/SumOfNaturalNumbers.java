package PracticeQuestions;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number of Your Choice: ");
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The Sum of Natural Number is: " + sum);

	}

}
