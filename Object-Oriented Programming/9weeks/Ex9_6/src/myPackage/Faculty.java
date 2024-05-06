package myPackage;

public class Faculty extends Employee {
	private String title;
	public Faculty() {
		super();
		title = "No title";
	}
	public Faculty(String initialName, int initialId, String initialDepartment, String initialTitle) {
		super(initialName, initialId, initialDepartment);
		title = initialTitle;
	}
	public void reset(String newName, int newId, String newDepartment, String newTitle) {
		super.reset(newName, newId, newDepartment);
		title = newTitle;
	}
	public String getTitle() {
		return title;
	}
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Title: " + title);
	}
	public boolean equals(Faculty otherFaculty) {
		return (super.equals(otherFaculty) &&
				this.title == otherFaculty.title);
	}
}
