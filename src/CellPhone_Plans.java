
public class CellPhone_Plans {

	String selectionOfOS(String os) {
		String operatingSystem = null;
		if (os.equals("IOS")) {
			operatingSystem = "IOS";
		}
		if (os.equals("Android")) {
			operatingSystem = "Android";
		}
		return operatingSystem;
	}

	String selectionOfProduct(String brand, String model) {
		String PhoneBrand = null;

		if (brand.equals("Samsung")) {
			PhoneBrand = "Samsung";
			// System.out.println("You Have Selected Samsung");
			if (model.equals("S22")) {
				PhoneBrand = "Samsung S22";
				// System.out.println("S22 costs $25/Month");
			} else if (model.equals("S22+")) {
				PhoneBrand = "Samsung S22+";
				// System.out.println("S22+ costs $35/Month");
			} else if (model.equals("S22 ULTRA")) {
				PhoneBrand = "Samsung ULTRA";
				// System.out.println("S22 ULTRA costs $55/Month");
			} else if (model.equals("S22 FE")) {
				PhoneBrand = "Samsung S2 Fe";
				// System.out.println("S22FE costs $20/Month");
			}

		}

		if (brand.equals("Apple")) {
			PhoneBrand = "Apple";
			// System.out.println("You have Selected Iphone");
			if (model.equals("Iphone_14_Pro")) {
				PhoneBrand = "Iphone_14_Pro";
				// System.out.println("Iphone 14 costs $30/Month");
			} else if (model.equals("Iphone_14_Pro_Max")) {
				PhoneBrand = "Iphone 14_pro_Max";
				// System.out.println("Iphone 14 Pro costs $40/Month");
			} else if (model.equals("Iphone_14_Mini")) {
				PhoneBrand = "Iphone_14_Mini";
				// System.out.println("Iphone 14 ProMAx costs $65/Month");
			}

		}

		return PhoneBrand;

	}

	String plans(String plansAdded) {
		String planoffers = null;
		int planPrice = 0;

		if (plansAdded.equals("Rogers")) {
			planoffers = "Rogers";
			planPrice = 70;
		} else if (plansAdded.equals("Bell")) {
			planoffers = "Bell";
			planPrice = 80;
		} else if (plansAdded.equals("Telus")) {
			planoffers = "Telus";
			planPrice = 75;
		}

		return planoffers;
		
		
		
	}
	
	

}
