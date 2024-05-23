package loopingstatements;

import java.util.Scanner;

public class StudentDetailsTest {
	static Scanner scanner;

	public static void main(String[] args) {
		int studentRollNumber;
		String studentName;
		int subject1Mark, subject2Mark, subject3Mark;
		int total = 0;
		float average;
		char studentPassingGrade;

		scanner = new Scanner(System.in);

		boolean iWantToContinue = true;
		do {

			System.out.println("Please enter your roll number: \n");
			studentRollNumber = scanner.nextInt();

			System.out.println("Please enter your name: \n");
			studentName = scanner.next();

			subject1Mark = getSubjectMark();
			subject2Mark = getSubjectMark();
			subject3Mark = getSubjectMark();

			System.out.println("Please enter mark subject2: \n");
			subject2Mark = scanner.nextInt();

			System.out.println("Please enter mark subject3: \n");
			subject3Mark = scanner.nextInt();

			total = calculateTotalOfSubjectMarks(subject1Mark, subject2Mark, subject3Mark);

			average = calculateAverageOfSubjectMarks(total, 3);

			studentPassingGrade = getStudentPassingGrade(average);

			printStudentDetails(studentName, studentRollNumber, subject1Mark, subject2Mark, subject3Mark, total,
					average, studentPassingGrade);
			System.out.println("Do you want to continue for next student yes/no? ");

			String wantToContinue = scanner.next();
			if (wantToContinue.equalsIgnoreCase("no")) {
				iWantToContinue = false;
			}

		} while (iWantToContinue);
	}

	private static int getSubjectMark() {
		System.out.println("Please enter mark subject: \n");
		int subjectMark = scanner.nextInt();
		return subjectMark;
	}

	private static void printStudentDetails(String studentName, int studentRollNumber, int subject1Mark,
			int subject2Mark, int subject3Mark, int total, float average, char studentPassingGrade) {
		System.out.println("###########################################");
		System.out.println("Here are the student details..");
		System.out.println("Student Name is : " + studentName);
		System.out.println("Student Roll Number is:  " + studentRollNumber);
		System.out.println("Student Subject Mark 1: " + subject1Mark);
		System.out.println("Student Subject Mark 2: " + subject2Mark);
		System.out.println("Student Subject Mark 3: " + subject3Mark);
		System.out.println("Student Marks Total: " + total);
		System.out.println("Student Marks Average : " + average);
		System.out.println("Student is in Grade : " + studentPassingGrade);
		System.out.println("###########################################");

	}

	private static char getStudentPassingGrade(float average) {
		char grade;
		if (average >= 75) {
			grade = 'A';
		} else if (average < 75 && average >= 60) {
			grade = 'B';
		} else if (average < 60 && average >= 40) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		return grade;
	}

	private static float calculateAverageOfSubjectMarks(int total, int totalSubjects) {
		float average = (float) total / totalSubjects;
		return average;
	}

	public static int calculateTotalOfSubjectMarks(int subject1, int subject2, int subject3) {
		int total = subject1 + subject2 + subject3;
		System.out.println("total: " + total);
		return total;
	}
}
