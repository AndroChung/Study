package myPackage;
import java.util.Scanner;

public class Ex3_6 {

	public static void main(String[] args) {
		int sizeOfTriangle;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the size of triangle as many as you want:");
		sizeOfTriangle = key.nextInt();
		if (sizeOfTriangle < 1 || sizeOfTriangle > 50) {
			System.out.println("wrong value");
			System.exit(0);
		}
		
		for(int i = 1; i <= sizeOfTriangle; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}		
			System.out.println();
			}
		for(int i = sizeOfTriangle - 1; i >0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		
		key.close();
	}

}
