
public class And_Or {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int marks = 100;
		if (marks > 70 && marks < 80) {
			System.out.println("Excellent");
		} else if (marks < 50 && marks > 45) {
			System.out.println("Pass");
		} else if (marks > 1 || marks < 45) {
			System.out.println("Work Hard");
		} else if (marks > 80 && marks < 95 || marks < 100) {
			System.out.println("Briliant");
		}
		

	}

}
