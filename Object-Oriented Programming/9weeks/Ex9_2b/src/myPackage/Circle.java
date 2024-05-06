package myPackage;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	public String toString() {
		return "Shape: Circle" +
						"\nArea: " + getArea();
	}
	public boolean equals(Circle otherCir) {
		return this.radius == otherCir.radius;
	}
}
