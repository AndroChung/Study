package myPackage;
import java.util.Scanner;

public class Ex2_3a {

	public static void main(String[] args) {
		int returnCash;
		int quarter, dime, nickel;
		
		Scanner key = new Scanner(System.in);
		System.out.print("제품의 가격을 입력하시오: ");
		returnCash = 100 - key.nextInt();
		
		quarter = returnCash/25;
		returnCash %= 25;
		
		dime = returnCash/10;
		returnCash %= 10;
		
		nickel = returnCash/5;
		returnCash %= 5;
		
		System.out.println(quarter + " quarters, " 
		+ dime + " dimes, and " + nickel + " nickels");
		
		key.close();

	}

}
