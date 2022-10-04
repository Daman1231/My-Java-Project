
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prices of Different Mobile Phones....");
		int price = 450;
		switch (price) {
		case 200:
			System.out.println("Samsung Galaxy s");
			break;
		case 500:
			System.out.println("Samsung Galaxy S3 ");
			break;
		case 800:
			System.out.println("Iphone x");
			break;
		case 1200:
			System.out.println("Iphone 12");
			break;
		case 1500:
			System.out.println("Iphone 13 Pro Max");
			break;
		default:
			System.out.println("Prices of Phones are Fixed.");
		}

	}

}
