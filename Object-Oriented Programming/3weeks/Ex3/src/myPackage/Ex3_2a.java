package myPackage;
import java.util.Scanner;

public class Ex3_2a {

	public static void main(String[] args) {
		int value;
		double average;
		int total = 0, max = 0, min = 0, count = 0;
		
		Scanner key = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a non-negative integer: ");
			
			value = key.nextInt();
			
			if (value < 0) {
				break;
			}
			
			if (count == 0) {
				min = value;
				max = value;
			} else {
				if (value > max) {
					max = value;
				}
				
				if (value < min) {
					min = value;
				}
			}
			total += value;
			count++;
			
			
		}
		average = (double)total/count;
		
		if (count >0) {
			System.out.println("max: " + max + "\nmin: " + min
					+ "\naverage: " + average);
		} else {
			System.exit(0);
		}
		
		key.close();

	}

}
