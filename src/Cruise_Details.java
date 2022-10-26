import java.util.Scanner;

public class Cruise_Details {

	String cruiseName;
	int no_Of_Days;
	int numDay;
	double selectedCruisePriceAdult = 0, selectedCruisePriceChildren = 0;
	double dinnerPriceForAdult = 0, dinnerPriceForChildren = 0;;

	public Cruise_Details(String nameOfCruise, int noOfTripDays) {
		cruiseName = nameOfCruise;
		no_Of_Days = noOfTripDays;
		
	}

//	int noOFDays(String cruise_Days) {
//		int days = 0;
//		if (cruise_Days.equals("Scenic_Cruise")) {
//			days = 3;
//		} else if (cruise_Days.equals("Sunset_Cruise")) {
//			days = 1;
//		} else if (cruise_Days.equals("Discovery_Cruise")) {
//			days = 4;
//		} else if (cruise_Days.equals("Mystery_Cruise")) {
//			days = 2;
//		}
//		return days;
//
//	}

	

	double priceOfCruiseAdult(String cruiseName) {
		if (cruiseName.equals("Scenic_Cruise")) {
			selectedCruisePriceAdult = 43.99;
		} else if (cruiseName.equals("Sunset_Cruise")) {
			selectedCruisePriceAdult = 52.99;
		} else if (cruiseName.equals("Discovery_Cruise")) {
			selectedCruisePriceAdult = 39.99;
		} else if (cruiseName.equals("Mystery_Cruise")) {
			selectedCruisePriceAdult = 45.99;
		}

		return selectedCruisePriceAdult;
	}

	double priceOfCruiseChildren(String cruiseName) {
		if (cruiseName.equals("Scenic_Cruise")) {
			selectedCruisePriceChildren = 12.99;
		} else if (cruiseName.equals("Sunset_Cruise")) {
			selectedCruisePriceChildren = 15.99;
		} else if (cruiseName.equals("Discovery_Cruise")) {
			selectedCruisePriceChildren = 9.99;
		} else if (cruiseName.equals("Mystery_Cruise")) {
			selectedCruisePriceChildren = 13.99;
		}

		return selectedCruisePriceChildren;
	}
	
	double priceOfDinnerBuffetAdults(String cruiseName) {

		if (cruiseName.equals("Scenic_Cruise")) {
			dinnerPriceForAdult = 20.99;
		} else if (cruiseName.equals("Sunset_Cruise")) {
			dinnerPriceForAdult = 20.99;
		} else if (cruiseName.equals("Discovery_Cruise")) {
			dinnerPriceForAdult = 20.99;
		} else if (cruiseName.equals("Mystery_Cruise")) {
			dinnerPriceForAdult = 20.99;
		}
		return dinnerPriceForAdult;
	}

	double priceOfDinnerBuffetChildren(String cruiseName) {
		
		if (cruiseName.equals("Scenic_Cruise")) {
			dinnerPriceForChildren = 4.99;
		} else if (cruiseName.equals("Sunset_Cruise")) {
			dinnerPriceForChildren = 4.99;
		} else if (cruiseName.equals("Discovery_Cruise")) {
			dinnerPriceForChildren = 4.99;
		} else if (cruiseName.equals("Mystery_Cruise")) {
			dinnerPriceForChildren = 4.99;
		}
		return dinnerPriceForChildren;
	}
}
