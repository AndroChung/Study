package myPackage;

public class Ex9_1b {

	public static void main(String[] args) {
		Doctor d1 = new Doctor("Taemin", Specialty.Medicine, 3);
		Doctor d2 = new Doctor("Minsu", Specialty.Dentist, 6);
		
		System.out.println("Before reset");
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d1.getName() + " and " +
							d2.getName() + " is Equal?: " +
							d1.equals(d2)
		);
		
		System.out.println();
		
		d2.reset("Taemin", Specialty.Medicine);
		System.out.println("After reset");
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d1.getName() + " and " +
							d2.getName() + " is Equal?: " +
							d1.equals(d2)
		);
	}

}
