package myPackage;

public class Ex4_1 {

	public static void main(String[] args) {
		MotorBoat boat = new MotorBoat();
		
		boat.C = 1000;
		boat.f = 700;
		boat.M = 100;
		boat.s = 70;
		boat.e = 10;
		int time = 5;
		
		
		boat.getUsedFuelAmount(time);
		boat.getTravelDistance(time);
		boat.getCanTravelDistance();

	}

}
