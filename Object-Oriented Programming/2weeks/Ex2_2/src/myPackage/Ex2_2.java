package myPackage;
import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		String text, firstWord;
		String firstChar, remainText;
		int firstWordPosition;
		
		Scanner key = new Scanner(System.in);
		
		text = key.nextLine();
		
		firstWordPosition = text.indexOf(" ");
		
		firstWord = text.substring(0, firstWordPosition);
		remainText = text.substring(firstWordPosition + 1);
		firstChar = remainText.substring(0, 1);
		firstChar = firstChar.toUpperCase();
		remainText = remainText.substring(1);
		
		System.out.println(firstChar + remainText + " " + firstWord);
		
		key.close();
		

	}

}
