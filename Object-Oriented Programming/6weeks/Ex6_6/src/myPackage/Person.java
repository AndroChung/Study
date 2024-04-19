package myPackage;

public class Person {
	private String name;
	private int age;
	
	// Constructor
	Person()  {
		name = "No name yet";
	}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// instance methods
	public void setName(String name) {
		this.name = name;
	}
	public void setName(String first, String last) {
		name = first + " " + last;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// static method
	public static Person createToddler() {
		Person toddler = new Person("A toddler", 2);
		return toddler;
	}
	public static Person createPreschooler() {
		Person preschooler = new Person("A preschooler", 5);
		return preschooler;
	}
	public static Person createAdolescent() {
		Person Adolescent = new Person("A adolescent", 9);
		return Adolescent;
	}
	public static Person createTeenager() {
		Person teenager = new Person("A teenager", 15);
		return teenager;
	}
	public static Person createAdult() {
		Person Adult = new Person("An adult", 21);
		return Adult;
	}
}
