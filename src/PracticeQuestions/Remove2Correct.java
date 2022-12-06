package PracticeQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

final public class Remove2Correct {

	public static void main(String[] args) {

		String line = "My second letter will be removed from each word";
		String[] lineArray = line.split(" ");
		System.out.println(Arrays.toString(lineArray));
		String newLine = "";
		for (int i = 0; i < lineArray.length; i++) {
			lineArray[i] = lineArray[i].substring(0, 1) + lineArray[i].substring(2);
			newLine = newLine + lineArray[i] + " ";
		}
		System.out.println("old line :" + line + "\nnew Line :" + newLine);

		String name = "My name is Swaroop Krishna";
		name.substring(0);
		System.out.println(name);

		StringBuilder sb = new StringBuilder("My name is Swaroop Krishna");
		sb.append(" bnv");
		System.out.println(sb);

	}

}
