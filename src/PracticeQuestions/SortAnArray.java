package PracticeQuestions;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min;
		int temp = 0;
		int num[] = { 53, 58, 12, 6, 98, 19 };
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(num));
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}

		System.out.println("Second");
//Second Attempt...
		int var[] = { 55, 92, 6, 91, 37, 64, 44, 79 };
		int minn;
		int tempp = 0;
		for (int i = 0; i < var.length; i++) {
			minn = i;
			for (int j = i + 1; j < var.length; j++) {
				if (var[j] < var[minn]) {
					minn = j;
				}

				tempp = var[i];
				var[i] = var[minn];
				var[minn] = tempp;

			}

		}

		System.out.println(Arrays.toString(var));
//		for (int i = 0; i < var.length; i++) {
//			System.out.println(var[i]);
//		}

		int number[] = { 45, 9, 46, 18, 68, 34 };
		int minnn;
		int temppp = 0;
		for (int i = 0; i < number.length; i++) {
			minnn = i;
			for (int j = i + 1; j < number.length; j++) {
				if (number[j] < number[minnn]) {
					minnn = j;
				}
				temppp = number[i];
				number[i] = number[minnn];
				number[minnn] = temppp;
			}

		}
		System.out.println(Arrays.toString(number));

	}

}
