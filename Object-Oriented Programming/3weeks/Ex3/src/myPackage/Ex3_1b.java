package myPackage;
import java.util.Scanner;

public class Ex3_1b {

	public static void main(String[] args) {
		int cash, returnCash;
		boolean isError = false;
		int quarter, dime, nickel;
		
		Scanner key = new Scanner(System.in);
		System.out.print("제품의 가격을 입력하시오: ");
		cash = key.nextInt();
		returnCash = 100 - cash;
		
		if (cash < 25) {
			System.out.println("error message: the cost is lower than 25 cents");
			isError = true;
		} 
		if (cash%5 != 0) {
			System.out.println("error message: the cost is not an integer multiple of 5");
			isError = true;
		}
		if (cash > 1000) {
			System.out.println("error message: the cost is over 1$");
			isError = true;
		}
		
		if (isError) {
			System.exit(0);
		}
		
		
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
