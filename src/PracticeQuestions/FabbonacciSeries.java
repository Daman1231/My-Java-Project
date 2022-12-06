package PracticeQuestions;

import java.util.Scanner;

public class FabbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 = 0;
//		int num2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Num: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Num: ");
		int num2 = sc.nextInt();
		int sum;
		
		for (int i = 0; i <= 10; i++) {
			sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		}

	}

}
