package myPackage;
import java.util.Scanner;

public class Ex2_1a {

	public static void main(String[] args) {
		int fourInt;
		
		Scanner key = new Scanner(System.in);
		
		fourInt = key.nextInt();
		
		System.out.println(fourInt/1000);
		System.out.println(fourInt%1000/100);
		System.out.println(fourInt%100/10);
		System.out.println(fourInt%10);
		
		key.close();

	}

}
