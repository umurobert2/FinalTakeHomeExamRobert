package takeHomeFinal;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {

		// Generate 500 random numbers
		int[] randomNumbers = new int[500];
		Random random = new Random();

		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = random.nextInt(1000) + 1; // Random numbers between 1 and 1000
			randomNumbers[i] = generateRandomNumber();
		}

		// Sort the array
		Arrays.sort(randomNumbers);

		// Ask the user for the Nth smallest number
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of N to find the Nth smallest number: ");
		int n = scanner.nextInt();

		// Ensure that the input is within the valid range
		if (n > 0 && n <= randomNumbers.length) {
			// Print the Nth smallest number
			System.out.println("The " + n + "th smallest number is: " + randomNumbers[n - 1]);
		} else {
			System.out.println("Please enter a value between 1 and 500.");
		}

		scanner.close();
	}

	private static int generateRandomNumber() {
		long nanoTime = System.nanoTime();
		return (int) (nanoTime % Integer.MAX_VALUE);
	}

}
