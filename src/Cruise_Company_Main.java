import java.util.Scanner;

public class Cruise_Company_Main {

	public static void main(String[] args) {
		// int noOfDays;

		double cruisePriceAdult = 0, cruisePriceChildren = 0;
		double buffetPriceAdult = 0, buffetPriceChildren = 0;
		double totalPrice;
		double hst;
		double finalPrice;
		boolean selection = true;
		double adults = 0;
		double children = 0;
		double adultDinnerPrice = 0;

		Cruise_Details ScenicCruise = new Cruise_Details("Scenic_Cruise", 3);
		Cruise_Details SunsetCruise = new Cruise_Details("Sunset_Cruise", 1);
		Cruise_Details DiscoveryCruise = new Cruise_Details("Discovery_Cruise", 4);
		Cruise_Details MysteryCruise = new Cruise_Details("Mystery_Cruise", 2);

		Scanner sc = new Scanner(System.in);
		// do {

		while (selection = true) {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select. \nScenic Cruise\n"
							+ "Sunset Cruise\r\n" + "Discovery Cruise\r\n" + "Mystery Cruise\r\n");
			String inputCruiseName = sc.next();
			cruisePriceAdult = ScenicCruise.priceOfCruiseAdult(inputCruiseName);
			cruisePriceChildren = ScenicCruise.priceOfCruiseChildren(inputCruiseName);
			// doubt for noOfDays.....
			System.out.println("The cruise that you have selected is " + inputCruiseName + " which is a 1 Days cruise");

			if (inputCruiseName.equals("Scenic_Cruise")) {
				System.out.println("Price for Adults	(greater than 12)	: " + cruisePriceAdult + " per day\r\n"
						+ "Price for kids above 5			: " + cruisePriceChildren + " per day\r\n" + "");
			} else if (inputCruiseName.equals("Sunset_Cruise")) {
				System.out.println("Price for Adults	(greater than 12)	: " + cruisePriceAdult + " per day\r\n"
						+ "Price for kids above 5			: " + cruisePriceChildren + " per day\r\n" + "");
			} else if (inputCruiseName.equals("Discovery_Cruise")) {
				System.out.println("Price for Adults	(greater than 12)	: " + cruisePriceAdult + " per day\r\n"
						+ "Price for kids above 5			: " + cruisePriceChildren + " per day\r\n" + "");
			} else if (inputCruiseName.equals("Mystery_Cruise")) {
				System.out.println("Price for Adults	(greater than 12)	: " + cruisePriceAdult + " per day\r\n"
						+ "Price for kids above 5			: " + cruisePriceChildren + " per day\r\n" + "");
			}

			System.out.println(
					"Please press Y if you want to continue with the selection or press any other alphabet to select another.");
			// selection = sc.next().charAt(0);
			char userEnter = sc.next().charAt(0);
			if (userEnter == 'y') {
				System.out.println("Enter the number of Adults");
				int numberOfAdults = sc.nextInt();

				if (numberOfAdults > 1) {
					adults = ((numberOfAdults) * cruisePriceAdult);
					System.out.println("The Price for " + numberOfAdults + " Adults is $" + adults);
				}
				if (userEnter == 'y') {
					System.out.println("Enter the number of children");
					int numberOfChildren = sc.nextInt();

					if (numberOfChildren > 1) {
						children = ((numberOfChildren) * cruisePriceChildren);
						System.out.println("The Price for " + numberOfChildren + " Children is $" + children);
					}
				}

				System.out.println(
						"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids? yes/no");
				String preBookDinner = sc.next();
				buffetPriceAdult = ScenicCruise.priceOfDinnerBuffetAdults(inputCruiseName);
				buffetPriceChildren = ScenicCruise.priceOfDinnerBuffetChildren(inputCruiseName);

				if (preBookDinner.equals("yes")) {
					System.out.println("Enter Number of Adults");
					int numberOfAdultsBuffet = sc.nextInt();

					if (numberOfAdultsBuffet > 1) {
						buffetPriceAdult = ((numberOfAdultsBuffet) * buffetPriceAdult);
						System.out.println("Buffet Special Price Adults " + buffetPriceAdult);
					}
				}
				if (preBookDinner.equals("yes")) {
					System.out.println("Enter Number of Children");
					int numberOfchildrenBuffet = sc.nextInt();

					if (numberOfchildrenBuffet > 1) {
						buffetPriceAdult = numberOfchildrenBuffet * buffetPriceChildren;
						System.out.println("Buffet Special Price Children " + buffetPriceChildren);
					}
				}
			}

			else {
				System.out.println("Please Enter y in order to contnue for selection for Booking! Thanks");
			}
			break;
		}
		System.out.println("Your Package Includes: ");
		totalPrice = adults + children + buffetPriceAdult + buffetPriceChildren;
		System.out.println("Total Price $" + totalPrice);
		hst = totalPrice * 0.15;
		System.out.println("HST @ 15% $ " + hst);
		finalPrice = totalPrice + hst;
		System.out.println("Final Price " + finalPrice);
	}

}
