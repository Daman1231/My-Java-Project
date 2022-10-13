	//Write a program to check if the number is prime or not.


public class Prime_OR_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputVariable = 13; int count = 0;
		
		for( int i = 1; i <= inputVariable; i++) {
			if(inputVariable % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Not a Prime Number");
		}

	}

}
