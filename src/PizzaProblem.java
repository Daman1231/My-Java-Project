/*
 * 
 * 9.	Write a program to prepare the bill for a pizza shop.
a.	Assume an order and work out the final bill.
b.	Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
c.	For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
d.	Extra cheese for any size pizza: + $1
For eg: If the Pizza is medium, pepperoni with extra cheese the program should
 calculate the final bill as 20+3+1 = $24 and print as
“Your final bill is $24”

 */
public class PizzaProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int smallPizzaPrice = 15;
//		int mediumPizzaPrice = 20;
//		int largePizzaPrice = 25;
//		int pepperoniForSmallPrice = 2;
//		int pepperoniForMediumLargePrice = 3;
//		int extraCheesePrice = 1;
// 		int finalBill;

//		int finalBill = 0;
//		int smallPizzaPrice = 15;
//		int mediumPizzaPrice = 20;
//		int largePizzaPrice = 25;
//		int pepperoniForSmallPrice = 2;
//		int pepperoniForMediumLargePrice = 3;
//		int extraCheesePrice = 1;
//		boolean pepperoniForSmall = false;
//
//		switch (mediumPizzaPrice) {
//		case 15:
//			
//			finalBill = smallPizzaPrice + extraCheesePrice;
//			System.out.println("The Small Pizza with Extra Cheese is for $" + finalBill);
//			finalBill = smallPizzaPrice + extraCheesePrice + pepperoniForSmallPrice;
//			System.out.println("The Small Pizza with Extra Cheese and Pepperoni is for $" + finalBill);
//			break;
//
//		case 20:
//			finalBill = mediumPizzaPrice + extraCheesePrice;
//			System.out.println("The Medium Pizza with Extra cheese is for $" + finalBill);
//			finalBill = mediumPizzaPrice + pepperoniForMediumLargePrice + extraCheesePrice;
//			System.out.println("The Medium Pizza with Extra cheese and pepperoni is for $" + finalBill);
//			break;
//
//		case 25:
//			finalBill = largePizzaPrice + extraCheesePrice;
//			System.out.println("The Large Pizza with Extra Cheese is for $" + finalBill);
//			finalBill = largePizzaPrice + pepperoniForMediumLargePrice + extraCheesePrice;
//			System.out.println("The Large Pizza with Extra Cheese and pepperoni is for $" + finalBill);
//
//		default:
//			System.out.println("Pizza Pizza is Closed");
//			break;
//		}
//
//		String Pizza = "medium";
//
//		if (Pizza == "small") {
//			finalBill = (smallPizzaPrice + pepperoniForSmallPrice);
//			System.out.println("The Small pizza is for $" + finalBill);
//			if (Pizza == "small") {
//				finalBill = (smallPizzaPrice + pepperoniForSmallPrice + extraCheesePrice);
//				System.out.println("The small Pizza with Extra Cheese for $" + finalBill);
//			}
//		}
//
//		else if (Pizza == "medium") {
//			finalBill = (mediumPizzaPrice + pepperoniForMediumLargePrice);
//			System.out.println("The Medium Pizza with pepperoni is for $" + finalBill);
//			if (Pizza == "medium") {
//				finalBill = (mediumPizzaPrice + pepperoniForMediumLargePrice + extraCheesePrice);
//				System.out.println("The Medium Pizza with pepperoni with Extra Cheese is for $" + finalBill);
//			}
//
//		} else if (Pizza == "large") {
//
//			finalBill = (largePizzaPrice + pepperoniForMediumLargePrice);
//			System.out.println("The Large pizza with pepperoni is for $" + finalBill);
//			if (Pizza == "large") {
//				finalBill = (largePizzaPrice + pepperoniForMediumLargePrice + extraCheesePrice);
//				System.out.println("The Large Pizza with pepperoni with Extra Cheese is for $" + finalBill);
//			}
//		} else {
//			System.out.println("Pizza shop is closed");
//		}

		System.out.println("WITH SWITCH CASE");

		int finalBill = 0;
		boolean pepperoniForSmall = true;
		boolean pepperoniforMediumLarge = false;
		boolean extraCheese = true;
		String pizzaSize = "small";
//		String mediumSizePizza = "medium";
//		String largeSizePizza = "large";
		int smallPizzaPrices = 15;
		int mediumPizzaPrices = 20;
		int largePizzaPrices = 25;

		switch (pizzaSize) {
		case "small":

			System.out.println("The Price for Small Pizza is $ " + smallPizzaPrices);

			if (pepperoniForSmall = true) {
				finalBill = 2 + smallPizzaPrices;
				System.out.println("The Price for Small Pizza with pepperoni is $" + finalBill);
			}
			if (extraCheese = true) {
				finalBill = smallPizzaPrices + 1;
				System.out.println("The Price for Small Pizza with extra cheese is for $" + finalBill);
			}
			if(pepperoniForSmall && extraCheese == true) {
				finalBill = smallPizzaPrices + 2 + 1;
				System.out.println("The Price for Small Pizza with Pepperoni and extra Cheese is for $" + finalBill);
			}
			break;

		case "medium":
			System.out.println("The Price for Medium Pizza is for $" + mediumPizzaPrices);

			if (extraCheese = true) {
				finalBill = mediumPizzaPrices + 1;
				System.out.println("The Price for Medium Pizza with extra cheese is for $" + finalBill);
			}
			if (pepperoniforMediumLarge = true) {
				finalBill = mediumPizzaPrices + 3;
				System.out.println("The Price for Medium Pizza with pepperoni is $" + finalBill);
			}
			if(pepperoniforMediumLarge && extraCheese == true) {
				finalBill = mediumPizzaPrices + 3 + 1;
				System.out.println("The Price for Medium Pizza with Pepperoni and extra cheese is for $" + finalBill);
			}
			break;

		case "large":
			System.out.println("The Price for Large Pizza is for $" + largePizzaPrices);
			if (extraCheese = true) {
				finalBill = largePizzaPrices + 1;
				System.out.println("The Large Pizza with extra cheese is for $" + finalBill);
			}
			if (pepperoniforMediumLarge = true) {
				finalBill = largePizzaPrices + 3;
				System.out.println("The Price for Large Pizza with pepperoni is $" + finalBill);
			}
			if(pepperoniforMediumLarge && extraCheese == true) {
				finalBill = largePizzaPrices + 3 + 1;
			}
		default:
			break;
		}

	}

}
