package pizzaShopAssignment;

import java.util.Scanner;

public class PizzaShop2 {
	void calculateFinalBill() {

		int[] pizzaPrices = { 0, 15, 20, 25 }; // 0 index not used, 1 for small, 2 for medium, 3 for large

		int[] pepperoniPrices = { 0, 2, 3 }; // 0 index not used, 1 for small, 2 for medium/large
		int extraCheesePrice = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose pizza size: (1) Small, (2) Medium, (3) Large");
		int pizzaSizeChoice = scanner.nextInt();

		System.out.println("Do you want pepperoni topping? (1) Yes, (2) No");
		int pepperoniChoice = scanner.nextInt();

		System.out.println("Do you want extra cheese? (1) Yes, (2) No");
		int extraCheeseChoice = scanner.nextInt();

		// Validate input for pizza size
		if (pizzaSizeChoice < 1 || pizzaSizeChoice > 3) {
			System.out.println("Invalid pizza size choice.");
			return;
		}

		// Calculate the final bill
		int finalBill = pizzaPrices[pizzaSizeChoice];

		// Validate input for pepperoni choice
		if (pepperoniChoice == 1 && pizzaSizeChoice == 1) {
			finalBill += pepperoniPrices[1];
		} else if (pepperoniChoice == 1) {
			finalBill += pepperoniPrices[2];
		}

		// Add extra cheese if chosen
		if (extraCheeseChoice == 1) {
			finalBill += extraCheesePrice;
		}

		// Display the final bill
		System.out.println("Your final bill is $" + finalBill);
	}
}
