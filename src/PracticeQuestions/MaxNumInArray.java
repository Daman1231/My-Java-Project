package PracticeQuestions;

public class MaxNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num[] = { 45, 65, 24, 22, 98, 87 };
//		int max = num[0];
//		for(int i = 0; i < num.length; i++) {
//			if(num[i] > max) {
//				max = num[i];
//			}
//		}
//		System.out.println(max);

		int num[] = { 45, 65, 24, 22, 98, 87 };
		int maximumNumber = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > maximumNumber) {
				maximumNumber = num[i];
			}
		}
		System.out.println(maximumNumber);
	}


//		int num[] = { 61, 66, 49, 89, 91, 32, 54 };
//		int max = num[0];
//		for (int i = 1; i < num.length; i++) {
//			if (num[i] > max) {
//				max = num[i];
//			}
//		}
//		System.out.println(max);

	//}

}
