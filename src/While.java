
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Age for not getting a License
		int age = 1;
		while (age < 16) {
			if (age % 3 == 0 || age % 5 == 0) {
				System.out.println(age);
			}
			age++;
		}
	}
}
