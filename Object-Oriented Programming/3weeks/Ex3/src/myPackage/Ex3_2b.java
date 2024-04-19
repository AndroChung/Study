package myPackage;
import java.util.Scanner;

public class Ex3_2b {

	public static void main(String[] args) {
		int value;
		int count = 0;
		int A = 0, B = 0, C = 0, D = 0, F = 0;
		
		Scanner key = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a non-negative integer: ");
			
			value = key.nextInt();
			if (value == -1) {
				break;
			} else if (value < 0) {
				System.out.println("Error");
				System.exit(0);
			}
			
			if (value > 100) {
				continue;
			}
			
			if (value >= 90) {
				A++;
			} else if (value >= 80) {
				B++;
			} else if (value >= 70) {
				C++;
			} else if (value >= 60) {
				D++;
			} else {
				F++;
			}
			count++;
			
			
		}
		
		System.out.println("total count: " + count);
		System.out.println("A count: " + A + ", B count: "
				+ B + ", C count: " + C + ", D count: "
				+ D + ", F count: " + F);
		
		
		key.close();

	}

}
