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

		int smallPizzaPrice = 15;
		int mediumPizzaPrice = 20;
		int largePizzaPrice = 25;
		int pepperoniForSmallPrice = 2;
		int pepperoniForMediumLargePrice = 3;
		int extraCheesePrice = 1;
		int finalBill;

		String Pizza = "medium";

		if (Pizza == "small") {
			finalBill = (smallPizzaPrice + pepperoniForSmallPrice);
			System.out.println("The Small pizza is for $" + finalBill);
			if (Pizza == "small") {
				finalBill = (smallPizzaPrice + pepperoniForSmallPrice + extraCheesePrice);
				System.out.println("The small Pizza with Extra Cheese for $" + finalBill);
			}
		}

		else if (Pizza == "medium") {
			finalBill = (mediumPizzaPrice + pepperoniForMediumLargePrice);
			System.out.println("The Medium Pizza with pepperoni is for $" + finalBill);
			if (Pizza == "medium") {
				finalBill = (mediumPizzaPrice + pepperoniForMediumLargePrice + extraCheesePrice);
				System.out.println("The Medium Pizza with pepperoni with Extra Cheese is for $" + finalBill);
			}

		} else if (Pizza == "large") {

			finalBill = (largePizzaPrice + pepperoniForMediumLargePrice);
			System.out.println("The Large pizza with pepperoni is for $" + finalBill);
			if (Pizza == "large") {
				finalBill = (largePizzaPrice + pepperoniForMediumLargePrice + extraCheesePrice);
				System.out.println("The Large Pizza with pepperoni with Extra Cheese is for $" + finalBill);
			}
		} else {
			System.out.println("Pizza shop is closed");
		}

	}

}
