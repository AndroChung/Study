package myPackage;
import java.util.Scanner;
public class Ex1_2b {
	public static void main(String args[]) {
		int n1, n2;
		Scanner key = new Scanner(System.in);
		
		n1 = key.nextInt();
		n2 = key.nextInt();
		
		System.out.println(n2-n1 +1);
		key.close();
	}

}
