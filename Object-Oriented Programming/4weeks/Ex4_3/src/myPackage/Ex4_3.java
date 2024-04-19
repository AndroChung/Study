package myPackage;
import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		Grade grade = new Grade();
		Scanner key = new Scanner(System.in);
		
		System.out.println("A: ");
		grade.setA(key.nextInt());
		System.out.println("B: ");
		grade.setB(key.nextInt());
		System.out.println("C: ");
		grade.setC(key.nextInt());
		System.out.println("D: ");
		grade.setD(key.nextInt());
		System.out.println("F: ");
		grade.setF(key.nextInt());
		
		grade.percentage();
		
		key.close();

	}

}
