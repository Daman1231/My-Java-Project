package InterviewProgram;

import java.util.ArrayList;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("ram");
		arrayList.add("sham");
		arrayList.add("peter");
		arrayList.add("cheater");
		arrayList.add("tom");
		
		for(int i = 0; i < arrayList.size(); i++) {
			if(arrayList.contains("a")) {
				arrayList.remove(i);
			}
		}
		System.out.println(arrayList);

	}

}
