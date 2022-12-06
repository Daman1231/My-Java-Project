package PracticeQuestions;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		while (true) {
//			int counter = 0;
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter a Number: ");
//			int num = sc.nextInt();
//
//			for (int i = 1; i <= num; i++) {
//				if (num % i == 0) {
//					counter++;
//				}
//
//			}
//			if (counter == 2) {
//				System.out.println(num + " Number is Prime");
//			} else {
//				System.out.println(num + " Number is not Prime");
//			}
//
//		}

//		int num = 19;
//		int count = 0;
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				count++;
//			}
//		}
//		if(count == 2) {
//			System.out.println(num + " Number is Prime");
//		}
//		else {
//			System.out.println(num + " Number is not Prime");
//		}
		
		
		
		
//		int count = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number: ");
//		int num1 = sc.nextInt();
//		for (int i = 1; i <= num1; i++) {
//			if (num1 % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			System.out.println("Number is Prime");
//		} else {
//			System.out.println("Number is not Prime");
//		}

		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int num = sc1.nextInt();
		int countt = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				countt++;
			}
		}
		if(countt == 2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
