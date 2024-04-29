package myPackage;

public class Doctor extends Person{
	private Specialty specialty;
	private double visit_fee;
	
	Doctor() {
		super();
	}
	Doctor(String initialName, Specialty specialty, double fee) {
		super(initialName);
		this.specialty = specialty;
		visit_fee = fee;
	}
	public void setFee(double fee) {
		if (fee < 0) 
			return;
		visit_fee = fee;
	}
	public double getFee() {
		return visit_fee;
	}
	public void reset(String newName, Specialty newSpecialty) {
		setName(newName);
		this.specialty = newSpecialty;
	}
	
	// Override
	public String toString() {
		return "Name: " + getName() +
				"\nSpecialty: " + specialty +
				"\nVisit Fee: " + getFee();
	}
	public boolean equals(Doctor otherDoctor) {
		if (!(otherDoctor != null && otherDoctor instanceof Doctor)) {
			return false;
		}
		return this.hasSameName(otherDoctor) &&
				(this.specialty == otherDoctor.specialty);
	}
	
}
