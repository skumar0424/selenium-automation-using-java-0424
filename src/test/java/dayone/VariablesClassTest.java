package dayone;

public class VariablesClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String myName = "Santosh";// String ==> data type to store group of
		// characters put together
		int number1 = 5;// int is a type of numeric complete numbers
		int number2 = 7;// int for complete number

		int result = 5 / 2;

		char grade;// declaring a variable
		grade = 'A';// initialitaion

		char gradeType = 'X';

		boolean hasPassed = true;

		float pi = 3.14f;// syntax for float initlization

		int intPi = (int) pi;

		float myFloatPi = (float) intPi;

		System.out.println("myFloatPi: " + "myFloatPi");
		System.out.println("myFloatPi: " + myFloatPi);

		int[] subjectMarks = { 87, 98, 56 };// array of value type int

		System.out.println(subjectMarks[0]);
		System.out.println(subjectMarks[1]);
		System.out.println(subjectMarks[2]);

		subjectMarks[2] = 65;

		System.out.println(subjectMarks[2]);

		String studentName = "Rama";

		char numericChar = '1';

		int myNumber = 5;

		String stringNumber = "10";

		int numberInt = Integer.parseInt(stringNumber);

		System.out.println(numberInt);

		int summation = numberInt + myNumber;

		System.out.println("summation: " + summation);

		int num1 = 5;
		int num2 = 4;
		float myresult = (float)num1/ (float)num2;
		
		System.out.println(myresult);
		
	
	}
}
