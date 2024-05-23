package abstractioninterfacespolymorphism;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose \n1.Square, \n2.Traingle, \n3.Exit \n");

		int userChoice = scanner.nextInt();

		Shape shape = null;

		if (userChoice == 1) {
			shape = new Square();
		} else if (userChoice == 2) {
			shape = new Triangle();
		} else {
			System.out.println("exiting");
		}
		shape.calculateArea();
		shape.calculateArea();
		shape.calculateArea();
		shape.calculateArea();
		shape.calculateArea();

	}
}
