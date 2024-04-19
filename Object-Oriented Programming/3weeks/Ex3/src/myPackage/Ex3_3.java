package myPackage;
import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		double balance, interest;
		int year = 10;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("If you want to exit the program, enter -1");
		System.out.println("Enter the balance:");
		balance = key.nextDouble();
		
		System.out.println("Enthe the interest");
		interest = key.nextDouble();
		
		while(balance != -1 && interest != -1) {
			double annualInterestAccountValue = balance, monthlyInterestAccountValue = balance, dailyInterestAccountValue = balance;
			double monthlyInterest = (interest/12.0)/100, dailyInterest = (interest/365.0)/100;
			double interestInPercent = interest/100.0;
			
			for(int i = 0; i < year; i++) {
				annualInterestAccountValue = annualInterestAccountValue + annualInterestAccountValue*interestInPercent;
				for(int j = 0; j < 12; j++) {
					monthlyInterestAccountValue = monthlyInterestAccountValue + monthlyInterestAccountValue*monthlyInterest;
					 
					}
				for(int j = 0; j < 365; j++) {
					dailyInterestAccountValue = dailyInterestAccountValue + dailyInterestAccountValue*dailyInterest;
				}
			}
			
			System.out.println("After " + year + " years, value of your account:");
			System.out.println("if you use anuualy interest: " + annualInterestAccountValue);
			System.out.println("if you use monthly interest: " + monthlyInterestAccountValue);
			System.out.println("if you use daily interest: " + dailyInterestAccountValue);
			
			System.out.println();
			System.out.println("If you want to exit the program, enter -1");
			System.out.println("Enter the balance:");
			balance = key.nextDouble();
			interest = key.nextDouble();
			
		}
		
		
		
		key.close();

	}

}
