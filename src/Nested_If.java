import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
//		Scanner sc = new Scanner(System.in);
//		boolean b = false;
//		while (!b) {
//			System.out.println("Enter Your Marks here: ");
//			marks = sc.nextInt();
//			{
//				if (marks > 80) {
//					System.out.println("Excellent");
//				} else if (marks > 50) {
//					System.out.println("Passed");
//				} else if (marks > 30) {
//					System.out.println("Below Average");
//				} else {
//					System.out.println("Failed");
//				}
//
//			}
//		}
		
		int i = 3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);

		
//		int x=3;
//		System.out.println(x/10);
//		System.out.println(x*0.1);
				
		int x=0,y=0,z=0;
		x =(++x+y--)*z++;
		System.out.println(x);

	}
	

	

}
