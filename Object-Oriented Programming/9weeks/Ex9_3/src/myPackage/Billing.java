package myPackage;

public class Billing {
	private double bill;
	Doctor d;
	Patient p;
	public Billing(Person p) {
		this.p = (Patient)p;
		this.bill = ((Patient)p).getBill();
	}
	public double getBill() {
		return bill;
	}
	public String toString() {
		return "===========Billing==========" + 
				"\nName: " + p.getName() +
				"\nIdentification Number: " + p.getId() +
				"\nTotal Bill: " + getBill();
	}
}
