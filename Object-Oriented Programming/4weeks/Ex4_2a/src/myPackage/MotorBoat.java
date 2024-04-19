package myPackage;

public class MotorBoat {
	public static final double C = 1000;
	public static final double M = 100;
	private double f, s, e;
	
	public double getF() {
		return f;
	}
	public double getS() {
		return s;
	}
	public double getE() {
		return e;
	}
	public void setF(double f) {
		if (f > 0 && f <= C) this.f = f;
		else System.out.println("Wrong fuel: " + f);
	}
	public void setS(double s) {
		if (s > 0 && s <= M) this.s = s;
		else System.out.println("Wrong speed: " + f);
	}
	public void setE(double e) {
		if (e > 0) this.e = e;
		else System.out.println("Wrong efficieny: " + e);
	}
	public int t = 5; 
	
	
	public void getUsedFuelAmount(int time) {
		System.out.println("The amount of fuel used");
		System.out.println("At Maximum speed: " + e*M*M*time);
		System.out.println("At Current speed: " + e*s*s*time);
	}
	public void getTravelDistance(int time) {
		System.out.println("The Travel distance: " + s*time);
	}
	public void getCanTravelDistance() {
		System.out.println("You can travel distance of " + (double)f/(e*s));
	}

}
