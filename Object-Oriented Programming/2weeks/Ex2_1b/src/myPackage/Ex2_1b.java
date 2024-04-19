package myPackage;
import java.util.Scanner;
public class Ex2_1b {

	public static void main(String[] args) {
		double fahrenheit;
		
		Scanner key = new Scanner(System.in);
		
		fahrenheit = key.nextDouble();
		System.out.println(5*(fahrenheit-32)/9d);
		
		key.close();
	}

}
