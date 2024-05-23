package dayone;

public class WelcomeToTestAutomation {
	public static void main(String[] args) {
		System.out.println("Hello Automation");

		char c = '1';
		int intC = (int) c - 48;
		System.out.println("intC: " + intC);

		String myString = "12";
		int myNum = 2;
		int myInt = Integer.parseInt(myString);
		int total = myNum + myInt;
		System.out.println(total);

		int a=Integer.parseInt(String.valueOf(c));

	}
}
