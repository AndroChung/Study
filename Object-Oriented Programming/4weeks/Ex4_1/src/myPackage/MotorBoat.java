package myPackage;

public class MotorBoat {
	public int C;
	public int f;
	public int M;
	public int s;
	public int e;
	
	public void getUsedFuelAmount(int t) {
		System.out.println("The amount of fuel used");
		System.out.println("At Maximum speed: " + e*M*M*t);
		System.out.println("At Current speed: " + e*s*s*t);
	}
	public void getTravelDistance(int t) {
		System.out.println("The Travel distance: " + s*t);
	}
	public void getCanTravelDistance() {
		System.out.println("You can travel distance of " + (double)f/(e*s));
	}

}
