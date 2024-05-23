package classsestest;

import accessmodifierstests.Car;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.color = "white";
		// can read the data of a private variable
		System.out.println("The car current speed is " + car.getSpeed());

		car.accelrateSpeed(10);

		System.out.println("The car current speed is " + car.getSpeed());

		car.accelrateSpeed(30);

		System.out.println("The car current speed is " + car.getSpeed());

		car.accelrateSpeed(35);

		System.out.println("The car current speed is " + car.getSpeed());

		car.accelrateSpeed(200);

		System.out.println("The car current speed is " + car.getSpeed());

		car.accelrateSpeed(20);

		System.out.println("The car current speed is " + car.getSpeed());
	}

}
