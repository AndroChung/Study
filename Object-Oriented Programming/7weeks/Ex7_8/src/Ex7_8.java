import java.util.Scanner;

public class Ex7_8 {

	public static void main(String[] args) {
		String pin = "61033";
		int[] randomNum = new int[10];
		String input;
		int[] answer = new int[pin.length()];
		Scanner key = new Scanner(System.in);
		
		while(true) {
			for (int i = 0; i < 10; i++) {
				randomNum[i] = (int)(Math.random()*3 + 1);
			}
			for (int index = 0; index < answer.length; index++) {
				answer[index] = randomNum[(int)pin.charAt(index)-48];
			}
			System.out.print("PIN: 0 1 2 3 4 5 6 7 8 9\n");
			System.out.print("NUM: ");
			for (int i = 0; i < randomNum.length; i++) {
				System.out.print(randomNum[i] + " ");
			}
			System.out.println();
			System.out.println("Enter your Num number correspond with PIN number");
			input = key.nextLine();
			int pass = 0;
			for (int index = 0; index < pin.length(); index++) {
				pass = 0;
				if ((int)input.charAt(index)-48 == answer[index]) {
					pass = 1;
				}
			}
			
			if (pass == 1) {
				System.out.println("Correct password!");
				break;
			} else {
				System.out.println("Incorrect password!!");
			}
			
			
		} 
		
		

	}

}
