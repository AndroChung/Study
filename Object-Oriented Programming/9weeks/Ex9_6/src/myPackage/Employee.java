package myPackage;

public class Employee extends Person {
	private int id;
	private String department;
	public Employee() {
		super();
		id = 0;
		department = "No department";
	}
	public Employee(String initialName, int initialId, String initialDepartment) {
		setName(initialName);
		id = initialId;
		department = initialDepartment;
	}
	public void reset(String newName, int newId, String newDepartment) {
		setName(newName);
		id = newId;
		department = newDepartment;
	}
	public int getId() {
		return id;
	}
	public String getDepartment() {
		return department;
	}
	public void writeOutput() {
		super.writeOutput();
		System.out.println("ID: " + id +
						"\nDepartment: " + department);
	}
	public boolean equals(Employee otherEmployee) {
		return (super.hasSameName(otherEmployee) &&
				this.id == otherEmployee.id && 
				this.department == otherEmployee.department);
	}
}
