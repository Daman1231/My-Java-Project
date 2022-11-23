package Week11_Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

	ArrayList<Item> loadItem() throws FileNotFoundException {
		ArrayList<Item> itemList = new ArrayList<>();
		File file = new File("D:\\Rocket\\phase-1.txt");
		Scanner readFile = new Scanner(file);
		while (readFile.hasNextLine()) {
			String[] line = readFile.nextLine().split("=");
			Item item = new Item();
			item.name = line[0];
			item.weight = Integer.parseInt(line[1]);
			itemList.add(item);
		}
		readFile.close();
		return itemList;
	}

	ArrayList<Rocket> loadU1(ArrayList<Item> itemList) {
		ArrayList<Rocket> arrayListR1 = new ArrayList<Rocket>();
		Rocket r1;
		while (itemList.size() > 0) {
			r1 = new R1();
			for (int i = 0; i < itemList.size(); i++) {
				if (r1.canCarry(itemList.get(i))) {
					r1.carry(itemList.get(i));
					itemList.remove(i);
				}
			}
			arrayListR1.add(r1);
		}

		return arrayListR1;
	}

	ArrayList<Rocket> loadU2(ArrayList<Item> itemList) {
		ArrayList<Rocket> arrayListR2 = new ArrayList<Rocket>();
		Rocket r2;
		while (itemList.size() > 0) {
			r2 = new R2();
			for (int i = 0; i < itemList.size(); i++) {
				if (r2.canCarry(itemList.get(i))) {
					r2.carry(itemList.get(i));
					itemList.remove(i);
				}
			}
			arrayListR2.add(r2);
		}
		return arrayListR2;
	}

	public int runSimulation(ArrayList<Rocket> rocketsList) {
		int totalCost = 0;
		int rocketCount = 0;
		Rocket rocket = null;
		for (int i = 0; i < rocketsList.size(); i++) {
			rocket = rocketsList.get(i);
			boolean launchLand = (rocketsList.get(i).launch() && rocketsList.get(i).land());
			if (launchLand) {
				System.out.println("Launch and Land Succesfull");
				rocketCount++;

			} else {
				System.out.println("Launch and Land Unsuccesfull");
				rocketCount += 2;
			}

		}
//		System.out.println(rocketCount);

		totalCost = rocketCount * rocket.getCost();
		return totalCost;

	}

}
