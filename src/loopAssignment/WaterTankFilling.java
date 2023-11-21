package loopAssignment;

import java.util.Scanner;

public class WaterTankFilling {

	Scanner scanner = new Scanner(System.in);

	void waterTankFillingProcess() {

		int tankCapacity = 100;
		int bucketCAPACITY = 10;
		int breakpoint = 90;
		int currentWaterLevel = 0;
		{

			// Using a for loop to fill the tank using buckets
			for (int numOfBucket = 1; numOfBucket <= tankCapacity / bucketCAPACITY; numOfBucket++) {
				System.out.println("Bucket " + numOfBucket + ": Filling...");

				// Check if filling the bucket will overflow the tank
				// if (currentWaterLevel + bucketCAPACITY <= tankCapacity) {
				if (currentWaterLevel <= tankCapacity) {
					currentWaterLevel += bucketCAPACITY;
					System.out.println("Water level: " + currentWaterLevel + " litres");
				}
				if (breakpoint == currentWaterLevel) {
					System.out.println("WaterTank will be overflow,the current level of water in tank is :"
							+ currentWaterLevel + " litres");

					break;
				}
			}

		}
	}

	{

	}
}
