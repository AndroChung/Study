package myPackage;
import java.util.Scanner;

public class Ex3_1c {

	public static void main(String[] args) {
		char letterGrade;
		double gradeValue;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter your letter grade: ");
		letterGrade = key.next().charAt(0);
		
		switch (letterGrade) {
		case 'A':
			gradeValue = 4.0;
			break;
		case 'B':
			gradeValue = 3.0;
			break;
		case 'C':
			gradeValue = 2.0;
			break;
		case 'D': 
			gradeValue = 1.0;
			break;
		default: 
			gradeValue = 0.0;
		}
		
		System.out.println("Your grade value: " + gradeValue);
		
		key.close();

	}

}
