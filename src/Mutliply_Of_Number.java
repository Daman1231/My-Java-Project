
public class Mutliply_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("With While Loop");
		int num = 1;
		while (num <= 10) {
			System.out.println(num * 3);
			num++;
		}

		System.out.println("With Do While Loop");
		num = 1;
		do {
			System.out.println(num * 2);
			num++;
		} while (num <= 10);

		System.out.println("With For Loop");
		for (int i = 1; i <= 20; i++) {
			System.out.println(i * 4);
		}

		System.out.println("Reverse Table");

		num = 10;
		while (num >= 1) {
			System.out.println(num * 2);
			num--;
		}

		System.out.println("Reverse Table with do while");
		num = 20;
		do {
			System.out.println(num * 2);
			num--;
		}
		while(num >= 1);
		
		System.out.println("Reverse Table with For Loop");
		
		for(num = 10; num >= 1; num--) {
			System.out.println(num * 2);
		}
	}

}
