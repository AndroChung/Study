package myPackage;
import java.util.Scanner;

public class Ex6_1a {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		Time time = new Time();
		
		// test setTime methods
		time.setTime(5, 30);
		System.out.println("setTime: " + time.getHour() + " hours " +
						time.getMinute() + " minutes\n");
		time.setTime2(5, 30, true);
		System.out.println("setTime2: " + time.getHour() + " hours " +
				time.getMinute() + " minutes\n");
		time.setTime2(19, 30, false);
		System.out.println("setTime2: " + time.getHour() + " hours " +
				time.getMinute() + " minutes\n");
		
		// test by wrong time
		time.setTime(32, 0);
		time.setTime(12, 72);
		
		key.close();
	}

}
