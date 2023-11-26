package arrayAssignment;

import java.util.Scanner;

public class ProductSelector {

	String[] phoneBrands = { "Samsung", "Google", "Apple" };
	String[][] products = { { "S20", "S21", "Flip3", "Fold3" },
			{ "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" },
			{ "iPhone12", "iPhone SE", "iPhone 15", "iPhone 13" } };
	Scanner scanner = new Scanner(System.in);
	String selectedBrand;

	void availableProductsDisplayed() {
		// Display available phone brands
		System.out.println("Available phone brands: Samsung, Google, Apple");

		// Get user input for the phone brand

		System.out.print("Enter a phone brand: ");
		String selectedBrand = scanner.nextLine();

		// Check if the entered brand is valid
		int brandIndex = indexOfIgnoreCase(phoneBrands, selectedBrand);
		if (brandIndex != -1) {
			// Display available products for the selected brand
			System.out.println("Available products for " + selectedBrand + ": ");
			for (String product : products[brandIndex]) {
				System.out.println("- " + product);
			}

			// Get user input for the selected product
			System.out.print("Enter a product name: ");
			String selectedProduct = scanner.nextLine();

			// Check if the entered product is valid
			if (containsIgnoreCase(products[brandIndex], selectedProduct)) {
				System.out.println("Product selected is: " + selectedProduct);
			} else {
				System.out.println(" Please select a product from the list.");

			}
		} else {
			System.out.println("Invalid phone brand. Please select a valid brand name from the list.");

		}
	}

	// helper method to find the index of a string in an array (case-insensitive)
	private static int indexOfIgnoreCase(String[] phoneBrands, String products) {
		for (int i = 0; i < phoneBrands.length; i++) {
			if (phoneBrands[i].equalsIgnoreCase(products)) {
				return i;
			}
		}
		return -1;
	}

	// Helper method to check if an array contains a given string (case-insensitive)
	private static boolean containsIgnoreCase(String[] phoneBrands, String products) {
		for (String s : phoneBrands)
			if (s.equalsIgnoreCase(products)) {
				return true;
			}

		return false;
	}
}