import java.util.Scanner;

public class CellPhonePlan_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean osSelection = false;

		String selectBrand;
		String phonePlans;
		String model;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Select the OS you want?");
		String selectOs = sc.next();

		CellPhone_Plans cpp = new CellPhone_Plans();
		String selection = cpp.selectionOfOS(selectOs);
		switch (selection) {
		case "IOS":
			System.out.println("You Have Selected IOS OS");

			break;
		case "samsung":
			System.out.println("You Have Selected Samsung");
			break;
		case "Iphone":
			System.out.println("You Have Selected Iphone");
			break;
		default:
			System.out.println("Select Preferred Brand Between Samsung and Iphone");

		}

		if (selectOs.equals("IOS")) {
			System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");
			Scanner sc2 = new Scanner(System.in);
			selectBrand = sc2.next();
			if (selectBrand.equals("Apple")) {
				System.out.println("You Have Selected Apple");

				System.out.println("Please Enter Model");
				Scanner sc3 = new Scanner(System.in);
				model = sc3.next();

				String selectingModel = cpp.selectionOfProduct(selectBrand, model);
				System.out.println("You Have Selected " + selectingModel);

				Scanner sc4 = new Scanner(System.in);
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
				String selectedPlan = sc4.next();

				String selectModelType = cpp.plans(selectedPlan);
				System.out.println("You have selected " + selectModelType);

				System.out.println("Please select the Phone Plan you want: Roger- $70/Month , Bell- $80/Month, Telus- $75/Month");
				Scanner sc5 = new Scanner(System.in);
				String phonePlan = sc5.next();

				Scanner sc6 = new Scanner(System.in);
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
				String plansAdded = sc6.next();
				
				String phonePrice = cpp.plans(plansAdded);
				System.out.println("Plans Selected " + phonePrice);
//				System.out.println("You Have Selected " + selectPlan);
//				Scanner sc6 = new Scanner(System.in);

			}
		}
		if (selectOs.equals("ANDROID")) {
			System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");
			
			
		
			Scanner sc2 = new Scanner(System.in);
			selectBrand = sc2.next();
			if (selectBrand.equals("Samsung")) {
				System.out.println("You Have Selected Samsung");

				System.out.println("Please Enter Model");
				Scanner sc3 = new Scanner(System.in);
				model = sc3.next();

				String samsungselectingModel = cpp.selectionOfProduct(selectBrand, model);
				System.out.println("You Have Selected " + samsungselectingModel);

				Scanner sc4 = new Scanner(System.in);
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
				String selectedPlan = sc4.next();

				String selectModelType = cpp.plans(selectedPlan);
				System.out.println("You have selected " + selectModelType);

				System.out.println("Please select the Phone Plan you want: Roger- $70/Month , Bell- $80/Month, Telus- $75/Month");
				Scanner sc5 = new Scanner(System.in);
				String phonePlan = sc5.next();

				Scanner sc6 = new Scanner(System.in);
				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
				String plansAdded = sc6.next();
				
				String phonePrice = cpp.plans(plansAdded);
				System.out.println("Plans Selected " + phonePrice);
			}
		}

	}
}
