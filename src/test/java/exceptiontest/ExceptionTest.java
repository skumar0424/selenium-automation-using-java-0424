package exceptiontest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("thread.sleep exception");
		}
		System.out.println("Enter number to divide");
		int number1 = scanner.nextInt();
		int number2 = 1;
		System.out.println("Enter number divide by");
		try {
			number2 = scanner.nextInt();
			if (number2 <= 0) {
				throw new ArithmeticException();
			}
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("did not enter a valid number");
		} finally {
			System.out.println("closing the program");
		}
		int result = 0;
		try {
			result = number1 / number2;// after 16th row execution, program execution terminated
		} catch (ArithmeticException arithmeticException) {// block runs in case of exception
			System.out.println(
					"Hi there, you have entered a zero divide-by number, which is not appropriate & close stopping the program execution");
		} finally {// execution both in try & exception cases
			System.out.println("Try block completed");
		}
		System.out.println("The division result is: " + result);

	}

}
