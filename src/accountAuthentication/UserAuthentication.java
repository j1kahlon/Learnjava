package accountAuthentication;

import java.util.Scanner;

public class UserAuthentication {

	// Saved credentials
	String savedUsername = "pivotAdmin";
	String savedPassword = "Admin123";

	// Constants
	int maxAttempts = 3;
	int attempts = 0;

	Scanner scanner = new Scanner(System.in);

	void userAuthenticationCheck() {
		// Using a for loop to provide three chances for user authentication
		for (int i = 1; i <= maxAttempts; i++) {
			System.out.print("Enter username: ");
			String enteredUsername = scanner.nextLine();

			System.out.print("Enter password: ");
			String enteredPassword = scanner.nextLine();

			// Check if entered credentials match the saved credentials
			if (enteredUsername.equals(savedUsername) && enteredPassword.equals(savedPassword)) {
				System.out.println("You are logged in to the application.");
				break; // Exit the loop if authentication is successful
			} else {
				attempts++;
				System.out.println(
						"Incorrect username or password. Try again. Remaining attempts: " + (maxAttempts - attempts));

				// Check if the user has exceeded the maximum number of attempts
				if (attempts == maxAttempts) {
					System.out.println("Account locked.");
					break; // Exit the loop if the account is locked
				}
			}
		}

		scanner.close();
	}
}
