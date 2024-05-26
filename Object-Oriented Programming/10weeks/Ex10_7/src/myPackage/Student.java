package myPackage;

public class Student extends Person implements java.lang.Comparable {
	private int studentNumber;
	public Student() {
		super();
		studentNumber = 0;
	}
	public Student(String initialName, int initialStudentNumber) {
		super(initialName);
		studentNumber = initialStudentNumber;
	}
	public void reset(String newName, int newStudentNumber) {
		setName(newName);
		studentNumber = newStudentNumber;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int newStudentNumber) {
		studentNumber = newStudentNumber;
	}
	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Student Number: " + studentNumber);
	}
	public boolean equals(Student otherStudent) {
		return this.hasSameName(otherStudent) && 
				(this.studentNumber == otherStudent.studentNumber);
	}
	// Compare by studentNumber
	public int compareTo(Object obj) {
		if (!(obj != null || obj instanceof Student)) return 0;
		Student student = (Student)obj;
		return this.studentNumber - student.studentNumber;
	}
	
	/* 
	//Compare by name
	public int compareTo(Object obj) {
		if (!(obj != null || obj instanceof Student)) return 0;
		Student student = (Student)obj;
		return this.getName().compareTo(student.getName());
	}
	*/
}
