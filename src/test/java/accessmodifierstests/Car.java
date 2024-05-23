package accessmodifierstests;

public class Car {
	private int speed;
	public String color;

	public int getSpeed() {
		return speed;
	}

	private void setSpeed(int speed) {
		this.speed = 0;
	}

	public void accelrateSpeed(int increaseSpeed) {
		if (speed + increaseSpeed > 200)
			speed = 200;
		else
			speed = speed + increaseSpeed;
	}

}
