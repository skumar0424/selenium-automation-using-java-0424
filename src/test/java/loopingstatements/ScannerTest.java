package loopingstatements;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ageOfUser;

		System.out.println("Hello there, please enter your year of birth: ");

		do {

			int yearOfBirth = scanner.nextInt();

			ageOfUser = 2024 - yearOfBirth;

			if (yearOfBirth <= 2024) {
				break;
			}

			System.out.println("Please enter appropriate year of birth: ");

		} while (true);
		System.out.println("Here is your age: " + ageOfUser);

		System.out.println("Hello there, please enter your year of birth: ");

		for (int counter = 0; counter < 10; counter++) {

			int yearOfBirth = scanner.nextInt();

			ageOfUser = 2024 - yearOfBirth;

			if (yearOfBirth <= 2024) {
				break;
			}

			System.out.println("Please enter appropriate year of birth: ");

		}
		System.out.println("Here is your age: " + ageOfUser);
	}

}
