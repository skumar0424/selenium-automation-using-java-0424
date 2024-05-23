package collectiontests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {
		List<String> studentName = new ArrayList<String>();

		studentName.add("Manveer");
		studentName.add("Aniket");
		studentName.add("Kshitija");
		studentName.add("Kshitija");
		/*
		 * System.out.println("first name: " + studentName.get(0));
		 */
		/*
		 * studentName.add(0, "Prashikha");
		 * 
		 * studentName.set(1, "Manvir");// set method is to update an existing member
		 * value
		 */
		boolean hasAniket = studentName.contains("Aniket");

		System.out.println("hasAniket: " + hasAniket);

		System.out.println("size of list: " + studentName.size());

		Set<String> statesOfIndia = new HashSet<String>();

		statesOfIndia.add("Manveer");
		statesOfIndia.add("Aniket");
		statesOfIndia.add("Kshitija");
		statesOfIndia.add("Kshitija");

		System.out.println("first name: " + studentName.get(0));

		System.out.println("size of list: " + statesOfIndia.size());

		// Maps - key value pair
		// Map - interface - giving direction to have methods
		HashMap<String, String> stateAndCapital = new HashMap<String, String>();

		stateAndCapital.put("Maharashtra", "Mumbai");
		stateAndCapital.put("Punjab", "Amritsar");
		stateAndCapital.put("AndhraPradesh", "Vijaywada");

	}

}
