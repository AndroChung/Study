package myPackage;

public class Staff extends Employee {
	private int payGrade;
	public Staff() {
		super();
		payGrade = 0;
	}
	public Staff(String initialName, int initialId, String initialDepartment, int initialPayGrade) {
		super(initialName, initialId, initialDepartment);
		payGrade = initialPayGrade;
	}
	public void reset(String newName, int newId, String newDepartment, int newPayGrade) {
		super.reset(newName, newId, newDepartment);
		setPayGrade(newPayGrade);
	}
	public void setPayGrade(int newPayGrade) {
		if (newPayGrade >= 1 && newPayGrade <= 20)
			payGrade = newPayGrade;
		else {
			System.out.println("Illegal Pay Grade!!");
			System.exit(0);
		}
	}
	public int getPayGrade() {
		return payGrade;
	}
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Pay Grade: " + payGrade);
	}
	public boolean equals(Staff otherStaff) {
		return (super.equals(otherStaff) &&
				this.payGrade == otherStaff.payGrade);
	}

}
