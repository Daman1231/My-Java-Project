package PracticeQuestions;

//Write a program to replace 2 number without using third variable.
public class Replace2NumWithout3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		System.out.println(b);
	}
}
