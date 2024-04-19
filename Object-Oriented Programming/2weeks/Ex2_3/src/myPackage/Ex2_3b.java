package myPackage;
import java.util.Scanner;

public class Ex2_3b {
	public static void main(String args[]) {
		double radius, depth;
		
		Scanner key = new Scanner(System.in);
		System.out.print("radius(inches)와 depth(feet)를 입력하시오: ");
		radius = key.nextDouble()/12.0;
		depth = key.nextDouble();
		System.out.println(Math.PI*radius*radius*depth*7.48 + " gallons");
		key.close();
	}

}
