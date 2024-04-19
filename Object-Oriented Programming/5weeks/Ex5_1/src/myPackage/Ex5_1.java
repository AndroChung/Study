package myPackage;

public class Ex5_1 {

	public static void main(String[] args) {
		MotorBoat boat1 = new MotorBoat();
		MotorBoat boat2 = new MotorBoat();
		
		boat1.setS(70);
		boat2.setS(60);
		System.out.println("boat1 Current speed: "+ boat1.getS() + 
							"\nboat2 Current speed: " + boat2.getS());
		System.out.println();
		
		boat1.setE(10);
		boat2.setE(10);
		System.out.println("boat1 Efficiency: " + boat1.getE() +
							"\nboat2 Efficiency: " + boat2.getE());
		System.out.println();
		
		boat1.setF(100);
		boat2.setF(100);
		System.out.println("boat1 Fuel: " + boat1.getF() +
							"\nboat2 Fuel: " + boat2.getF());
		System.out.println();
		
		System.out.println("Test if boat1 instances is equal to boat2:");
		if (boat1.equals(boat2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
		System.out.println();
		
		boat2.setS(70);
		System.out.println("boat1 Current speed: "+ boat1.getS() + 
				"\nboat2 Current speed: " + boat2.getS());
		System.out.println();
		
		System.out.println("Retest:");
		if (boat1.equals(boat2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
	}

}
