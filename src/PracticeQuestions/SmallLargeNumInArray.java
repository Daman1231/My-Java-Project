package PracticeQuestions;

//Write a program to find smallest and largest number in an array.
public class SmallLargeNumInArray {

	public static void main(String[] args) {
//		int num[] = { 24, 12, 85, 91, 3, 2 };
//		int max = num[0];
//		int min = num[0];
//		for (int i = 1; i < num.length; i++) {
//			if (num[i] > max) {
//				max = num[i];
//			}
//			else if(num[i] < min) {
//				min = num[i];
//			}
//		}
//
//		System.out.println("Largest Num in Array " + max);
//		System.out.println("Smallest Num in Array " + min );
		
		
		
		
		int num[] = {45,32,98,06,02,78,91};
		int min = num[0];
		int max = num[0];
		for(int i = 0; i < num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
			else if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
	
		String name = "Daman";
		int reslt = name.length();
		System.out.println(reslt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
