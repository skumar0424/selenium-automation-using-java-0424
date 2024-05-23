package dayone;

public class ConditionalStatementSwtichTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayNumber = 2;
		String dayName;
		switch (dayNumber) {

		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 7:
			dayName = "Saturday";
			break;
		default:
			dayName = "Not valid day number";
		}

		System.out.println("the day name is: " + dayName);
	}

}
