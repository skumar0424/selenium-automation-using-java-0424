package dayone;

public class ConditionalStatementIfTet {

	public static void main(String[] args) {
		String user1 = "John";
		String user2 = "John Kandy";

		if (user1.equals(user2)) {
			System.out.println("user1 & user2 are equals()");
		} else if (user2.contains(user1)) {
			System.out.println("usre1 is in user2 are contains()");
		} else {
			System.out.println("user1 is in user2 are not equals()");

		}
	}

}
