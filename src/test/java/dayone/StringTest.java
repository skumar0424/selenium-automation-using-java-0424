package dayone;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "john";

		String userName2 = "JOHN";

		String name = "navnath";

		System.out.println("equals ignore case: " + userName.equalsIgnoreCase(userName2));
		System.out.println("equals case sensitive: " + userName.equals(userName2));

		System.out.println(userName.length());

		char charAtPositionOne = userName.charAt(1);

		System.out.println("charAtPositionOne: " + charAtPositionOne);

		System.out.println(userName.charAt(2));

		String subStringOfUserName = userName;

		String subStringOfUserPassword = userName;

		System.out.println("subStringOfUserName: " + subStringOfUserName);
		// String + variable
		String surName = "Kandy";

		String subString2 = "hamburger".substring(4, 8);// returns "urge";

		int result = 5 + 2;// 7

		String stringResult = "John" + "Kandy";

		System.out.println("Full Name: " + userName + " " + surName);

		String fullName = userName.concat(surName);

		System.out.println(fullName);

		String todayWeather = " Today is a cool day ";

		String todayWeatherTrimmed = todayWeather.trim();
		System.out.println("'" + todayWeatherTrimmed + "'");

		String todayWeather2 = todayWeather.replace(" ", "");
		System.out.println("todayWeather: " + todayWeather2);

		String splitMethodTest = "Today is Friday & A Great day";

		String[] stringArray = splitMethodTest.split(" ");

		System.out.println(stringArray.length);

		System.out.println("stringArray[0] position - " + stringArray[0]);
		System.out.println("stringArray[1] position - " + stringArray[1]);

		System.out.println("stringArray[2] position - " + stringArray[2]);

		String mySplitString2 = "TodayWeather";

		String[] mySplitStringArray2 = mySplitString2.split(mySplitString2);
		System.out.println("mySplitStringArray2: " + mySplitStringArray2.length);
		// System.out.println(mySplitStringArray2[0]);

		String stringOne = "John";
		String stringTwo = "John ";

		boolean isEquals = stringOne.equals(stringTwo);

		System.out.println("Are Strings Equals: " + isEquals);

		stringTwo = stringTwo.toUpperCase();

		isEquals = stringOne.equals(stringTwo);

		System.out.println("Are Strings Equals: " + isEquals);

		isEquals = stringOne.trim().equalsIgnoreCase(stringTwo.trim());

		System.out.println("Are Strings Equals: " + isEquals);
		String myUserName1 = "Rama";
		String myUserName2 = "Rama";
		String myUserName3 = "Rama";
		boolean areEquals = myUserName1 == myUserName2;
		System.out.println("areEquals: " + areEquals);

		myUserName1 = new String("Rama");
		myUserName2 = new String("Rama");
		System.out.println("myUserName1: " + myUserName1);
		System.out.println("myUserName2: " + myUserName2);
		areEquals = myUserName1 == myUserName2;
		System.out.println("areEquals: " + areEquals);

		areEquals = myUserName1.equals(myUserName2);
		System.out.println("areEquals: " + areEquals);

	}

}
