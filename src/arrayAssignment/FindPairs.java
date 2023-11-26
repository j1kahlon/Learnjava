package arrayAssignment;

public class FindPairs {

	int[] array = { -40, -5, 1, 3, 6, 7, 8, 20 };
	int targetSum = 15;

	void findPairsWithSum() {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == targetSum) {
					System.out.println(
							"Pair of elements whose sum is equal to " + targetSum + ": " + array[i] + ", " + array[j]);
				}
			}
		}
	}
}