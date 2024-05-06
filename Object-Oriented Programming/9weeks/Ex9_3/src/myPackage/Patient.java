package myPackage;

public class Patient extends Person {
	private String id;
	private double bill;
	public Patient(String initialName, String initialId) {
		super(initialName);
		id = initialId;
		bill = 0;
	}
	public void reset(String newName, String newId) {
		setName(newName);
		id = newId;
	}
	public void visit(Doctor d) {
		bill += d.getFee();
		d.setIncome(d.getFee());
	}
	public String getId() {
		return id;
	}
	public double getBill() {
		return bill;
	}
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Indentification Number: " + id);
	}
	public boolean equals(Patient otherPatient) {
		return this.hasSameName(otherPatient) &&
				(this.id == otherPatient.id);
	}
}
