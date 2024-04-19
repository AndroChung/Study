package myPackage;
import java.util.Scanner;

public class Ex4_2a {

	public static void main(String[] args) {
		int time = 5;
		MotorBoat boat = new MotorBoat();
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the Fuel: ");
		boat.setF(key.nextDouble());
		System.out.println("Enter the Speed: ");
		boat.setS(key.nextDouble());
		System.out.println("Enter the Efficiency: ");
		boat.setE(key.nextDouble());
		
		System.out.println("Information:\n" + "C: " + MotorBoat.C + 
				"\nM: " + MotorBoat.M + "\nCurrent Fuel: " + boat.getF() +
				"\nCurrent Speed: " + boat.getS() + "\nEfficiency: " + boat.getE());
		
		boat.getUsedFuelAmount(time);
		boat.getTravelDistance(time);
		boat.getCanTravelDistance();
		
		key.close();

	}

}
