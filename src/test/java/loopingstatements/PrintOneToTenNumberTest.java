package loopingstatements;

public class PrintOneToTenNumberTest {

	public static void main(String[] args) {
		System.out.println("Printing zero to 10 using for loop");
		for (int counter = 1; counter < 11; counter++) {
			System.out.println("counter: " + counter);
		}

		System.out.println("Printing zero to 10 using While loop");
		int counter = 1;
		while (counter < 11) {
			System.out.println("counter: " + counter);
			counter++;
		}

		System.out.println("Printing zero to 10 using Do-While loop");
		int doWhileCounter = 1;
		do {
			System.out.println("counter: " + doWhileCounter);
			doWhileCounter++;
		} while (doWhileCounter < 11);

		String[] studentNames = { "John", "Antony", "Kandy", "Rama", "Mohammad" };

		System.out.println("Printing an array of Strings using for loop");
		System.out.println("Printing zero to 10 using for loop");
		for (int counter1 = 0; counter1 < 5; counter1++) {
			System.out.println("counter: " + studentNames[counter1]);
		}

		System.out.println("Printing an array of Strings using for-each loop");
		for (String studentName : studentNames) {
			System.out.println("The studnet name is: " + studentName);
		}

		String todaysDay = "Today is a great day and I enjoy it";
		String[] todayInWords = todaysDay.split(" ");
		for (String word : todayInWords) {
			System.out.println("word: " + word);
		}

	}

}
