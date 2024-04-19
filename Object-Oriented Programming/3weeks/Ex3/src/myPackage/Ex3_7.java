package myPackage;
import java.util.Scanner;

public class Ex3_7 {

	public static void main(String[] args) {
		int velocity = 0;
		double height = 0;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter the initial velocity of the ball: ");
		velocity = key.nextInt();
		
		for (int time = 0; time < 16; time++) {
			if (time != 0) {
				height += velocity;
				velocity -= 32;
				if (height < 0) {
					height *= -0.5;
					velocity *= -0.5;
					System.out.println("Bounce!");
					System.out.println("Time: " + time + 
							" Height: " + height);
					} else {
						System.out.println("Time: " + time + 
								" Height: " + height);
						}
					} else {
						System.out.println("Time: " + time + 
								" Height: " + height);
					}
			
			
		key.close();
		}

	

}
}
