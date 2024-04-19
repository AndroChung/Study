package myPackage;
import java.util.Scanner;

public class Ex3_1a {

	public static void main(String[] args) {
		int check;
		double charge;

		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter the check amount: ");
		check = key.nextInt();
		
		if (check < 10) {
			charge = 1;
		} else if (check < 100) {
			charge = check*0.1;
		} else if (check < 1000) {
			charge = 5 + check*0.05;
		} else {
			charge = 40 + check*0.01;
		}
		
		System.out.println(charge + "$");
		
		key.close();

	}

}
