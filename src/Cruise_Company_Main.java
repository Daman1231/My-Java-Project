import java.util.Scanner;

public class Cruise_Company_Main {

	public static void main(String[] args) {
		int noOfDays;

		double cruisePriceAdult = 0, cruisePriceChildren = 0;
		
		Cruise_Details ScenicCruise = new Cruise_Details("Scenic_Cruise",3);
		Cruise_Details SunsetCruise = new Cruise_Details("Sunset_Cruise",1);
		Cruise_Details DiscoveryCruise = new Cruise_Details("Discovery_Cruise",4);
		Cruise_Details MysteryCruise = new Cruise_Details("Mystery_Cruise",2);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("We offer 4 different packages as displayed below. Please enter the cruise that you want to select. \nScenic Cruise\n"
				+ "Sunset Cruise\r\n"
				+ "Discovery Cruise\r\n"
				+ "Mystery Cruise\r\n");
		String inputCruiseName = sc.next();
		cruisePriceAdult = ScenicCruise.priceOfCruiseAdult(inputCruiseName);
		cruisePriceChildren = ScenicCruise.priceOfCruiseChildren(inputCruiseName);
		// doubt for noOfDays.....
		System.out.println("The cruise that you have selected is " + inputCruiseName + " which is a 1 Days cruise");
		
		

		if(inputCruiseName.equals("Scenic_Cruise")) {
			System.out.println("Price for Adults	(greater than 12)	: "+ cruisePriceAdult +" per day\r\n"
					+ "Price for kids above 5			: " + cruisePriceChildren + " per day\r\n"
					+ "");
		}
		else if(inputCruiseName.equals("Sunset_Cruise")) {
			System.out.println("Price for Adults	(greater than 12)	: "+ cruisePriceAdult +" per day\r\n"
					+ "Price for kids above 5			: " + cruisePriceChildren + " per day\r\n"
					+ "");
		}
		if(inputCruiseName.equals("Discovery_Cruise")) {
			System.out.println("Price for Adults	(greater than 12)	: "+ cruisePriceAdult +" per day\r\n"
					+ "Price for kids above 5			: " + cruisePriceChildren + " per day\r\n"
					+ "");
		}
		if(inputCruiseName.equals("Mystery_Cruise")) {
			System.out.println("Price for Adults	(greater than 12)	: "+ cruisePriceAdult +" per day\r\n"
					+ "Price for kids above 5			: " + cruisePriceChildren + " per day\r\n"
					+ "");
		}
		
	}

}
