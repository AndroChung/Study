package myPackage;
import java.util.Scanner;

public class Ex7_1a {

	public static void main(String[] args) {
		int[] scores;
		int n, total = 0;
		double average;
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the number of scores:");
		n = key.nextInt();
		
		scores = new int[n];
		
		System.out.println("Enter the scores list: ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = key.nextInt();
			total += scores[i];
		}
		
		average = total/(double)scores.length;
		
		System.out.println("Average of scores: " + average);
		System.out.println("Scores:");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		key.close();
	}

}
