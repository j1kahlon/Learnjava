package loopAssignment;

import java.util.Scanner;

public class AmusementPark {

	Scanner scanner = new Scanner(System.in);
	int currentCapacityOfPerson ;
	void ridesAllowed() {
		int max_CAPACITY = 10;

		{
			int currentCapacityOfPerson = 0;
			

			for (int noOfPeople = 1; noOfPeople <= max_CAPACITY; noOfPeople++) {

				System.out.println("Enter the height of person " + noOfPeople + " (in cm): ");				int height = scanner.nextInt();

				// Check height criteria
				if (height > 90 && height < 200) {
					System.out.println("Person " + noOfPeople + " is allowed on the ride.");
					currentCapacityOfPerson++;
				} else {
					System.out.println("Person " + noOfPeople
							+ " does not meet the height criteria and is not allowed  on the ride.");
					noOfPeople--;
					System.out.println(
							"Check again the eligibility of another person to fill the place of person" );
					
				}
			}
			System.out.println("The Ride is full . No more people can get on");
		}
	}
}

// Exit the loop if the ride is full
