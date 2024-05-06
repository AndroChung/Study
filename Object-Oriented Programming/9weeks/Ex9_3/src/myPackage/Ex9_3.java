package myPackage;

public class Ex9_3 {

	public static void main(String[] args) {
		Person[] people = new Person[4];
		people[0] = new Doctor("Taemin", "Pediatrician", 300);
		people[1] = new Doctor("Yougin", "Obstetrician", 500);
		people[2] = new Patient("Youngmin", "202135233");
		people[3] = new Patient("Minsu", "202335522");
		
		((Patient)people[2]).visit((Doctor)people[0]);
		((Patient)people[3]).visit((Doctor)people[1]);
		
		Billing b1 = new Billing(people[2]);
		Billing b2 = new Billing(people[3]);
		
		for (Person p : people) {
			p.writeOutput();
			System.out.println();
		}
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		
	}

}
