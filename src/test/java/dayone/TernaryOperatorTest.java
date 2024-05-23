package dayone;

public class TernaryOperatorTest {

	public static void main(String[] args) {
		String usr1 = "John";
		String usr2 = "John Kandy";

		String result = usr1.equals(usr2) ? "Matching Users" : "Not matched users";

		System.out.println("result: " + result);

		int averageMarks = 76;

		String examResult = averageMarks > 75 ? "Distinction" : "Passed Class";

		System.out.println("examResult: " + examResult);

		String oddEventResult = averageMarks % 2 == 0 ? "This is even Number" : "It is an odd number";

		System.out.println("oddEventResult: " + oddEventResult);
	}

}
