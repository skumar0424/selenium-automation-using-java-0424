package classsestest;

public class Student {

	public String studentName;
	public int subjectMarks1;
	public int subjectMarks2;
	public int subjectMarks3;
	public int totalOfMarks;

	// constructor is an entity that helps creating object
	// a constructor is like a method having smae name of class
	// a constructor run, while creating the object of the class
	// constructor overloading - two contructors with different input arguments
	public Student() {
		System.out.println("About to create a Student Object");
		subjectMarks1 = 0;
		subjectMarks2 = 0;
		subjectMarks3 = 0;
	}

	public Student(String studentName) {
		System.out.println("About to create a Student Object");
		this.studentName = studentName;
		subjectMarks1 = 0;
		subjectMarks2 = 0;
		subjectMarks3 = 0;
	}

	public Student(String studentName, int subjectMarks1, int subjectMarks2, int subjectMarks3) {
		System.out.println("About to create a Student Object");
		this.studentName = studentName;
		this.subjectMarks1 = subjectMarks1;
		this.subjectMarks2 = subjectMarks2;
		this.subjectMarks3 = subjectMarks3;
	}

	public int calculateTotalOfMarks() {
		totalOfMarks = subjectMarks1 + subjectMarks2 + subjectMarks3;
		return totalOfMarks;
	}

	public int calculateTotalOfMarks(int subjectMarks1, int subjectMarks2, int subjectMarks3) {
		totalOfMarks = subjectMarks1 + subjectMarks2 + subjectMarks3;
		return totalOfMarks;
	}

	public void printTotalOfMarks() {
		System.out.println("totalOfMarks: " + totalOfMarks);
	}
}
