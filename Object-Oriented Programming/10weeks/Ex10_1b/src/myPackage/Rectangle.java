package myPackage;

public class Rectangle implements Shape {
	private double height, width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return height*width;
	}
	public String toString() {
		return "Shape: Rectangle" +
						"\nArea: " + getArea();
	}
	public boolean equals(Rectangle otherRec) {
		return (this.height == otherRec.height) && 
				(this.width == otherRec.height);
	}
}
