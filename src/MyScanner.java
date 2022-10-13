import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3, num4;
		String name = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		num1 = sc.nextInt();
		System.out.println("Enter Second number: ");
		num2 = sc.nextInt();
		System.out.println("Enter Third number: ");
		num3 = sc.nextInt();
		System.out.println("Enter Your Name Here " );
		name = sc.next();
		System.out.println(name);
		

		num4 = num1 + num2 + num3;
		System.out.println(name+"! the Result for this operation is: " + num4);
//		
		
	

		
		
	}

}
