package classsestest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();// object created
		// space alloted for student

		student.studentName = "John";
		student.subjectMarks1 = 60;
		student.subjectMarks2 = 66;
		student.subjectMarks3 = 67;

		student.calculateTotalOfMarks();

		student.printTotalOfMarks();

		Student student2 = new Student();

		student2.studentName = "Santosh";
		student2.subjectMarks1 = 62;
		student2.subjectMarks2 = 63;
		student2.subjectMarks3 = 65;

		student2.calculateTotalOfMarks();

		student2.printTotalOfMarks();

		Student student3 = new Student("Manvir", 67, 78, 98);
		student3.calculateTotalOfMarks();
		student3.printTotalOfMarks();

		Student student4 = new Student("Pratiksha");

	}

}
