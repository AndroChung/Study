package myPackage;

public class Doctor extends Person{
	private String specialty;
	private double visit_fee;
	private double income;
	
	Doctor() {
		super();
		income = 0;
	}
	Doctor(String initialName, String specialty, double fee) {
		super(initialName);
		this.specialty = specialty;
		visit_fee = fee;
		income = 0;
	}
	public void setFee(double fee) {
		if (fee < 0) 
			return;
		visit_fee = fee;
	}
	public double getFee() {
		return visit_fee;
	}
	public void setIncome(double fee) {
		income += fee;
	}
	public double getIncome() {
		return income;
	}
	public void reset(String newName, String newSpecialty, double newFee) {
		setName(newName);
		this.specialty = newSpecialty;
		this.visit_fee = newFee;
	}
	
	// Override
	public String toString() {
		return "Name: " + getName() +
				"\nSpecialty: " + specialty +
				"\nVisit Fee: " + getFee() +
				"\nTotal Income: " + getIncome();
	}
	public void writeOutput() {
		System.out.println(this.toString());
	}
	public boolean equals(Doctor otherDoctor) {
		if (!(otherDoctor != null && otherDoctor instanceof Doctor)) {
			return false;
		}
		return this.hasSameName(otherDoctor) &&
				(this.specialty == otherDoctor.specialty);
	}
	
}
