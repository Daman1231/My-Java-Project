package InterviewProgram;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "arora";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not a Palindrome");
		}

	}

}
