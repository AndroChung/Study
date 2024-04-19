package myPackage;
import java.util.Scanner;

public class Ex7_1b {

	public static void main(String[] args) {
		int[] frequency = new int[10];
		String str;
		Scanner key = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter a phone number: ex) 010-1234-5678");
			System.out.println("exit: #");
			str = key.nextLine();
			
			if (str.equals("#")) {
				key.close();
				break;
			}
			
			for (int i = 0; i < str.length(); i++) {
				if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
					frequency[(int)str.charAt(i) - 48]++;
				}
			}
			
			System.out.println("For " + str);
			for (int i =0; i < frequency.length; i++) {
				System.out.print("frequency[" + i + "] = " + frequency[i]);
				if (i != frequency.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
			System.out.println();
			
			for (int i = 0; i < frequency.length; i++) {
				frequency[i] = 0;
			}
			
			
		}
		
		
	}

}
