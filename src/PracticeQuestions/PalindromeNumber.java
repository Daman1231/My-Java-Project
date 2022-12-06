package PracticeQuestions;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int num = 121;
		for (int i = num; i >= 0; i--) {
			temp = temp + i;
		}
		System.out.println(temp);

	}

}
