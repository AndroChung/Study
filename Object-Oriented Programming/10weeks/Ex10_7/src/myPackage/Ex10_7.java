package myPackage;
import java.util.Arrays;

public class Ex10_7 {

	public static void main(String[] args) {
		Student[] student = new Student[5];
		student[0] = new Student("TaeMin", 202135233);
		student[1] = new Student("Minsu", 202035335);
		student[2] = new Student("Minjae", 202233278);
		student[3] = new Student("Guchu", 201835887);
		student[4] = new Student("Daewhang", 201735761);
		
		Arrays.sort(student);
		
		for (Student s : student) {
			s.writeOutput();
		}

	}

}
