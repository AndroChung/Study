package myPackage;

public class RightTriangle extends Shape {
private double height, width;
	
	public RightTriangle(double width) {
		this.height = (Math.sqrt(3)/2)*width;
		this.width = width;
	}
	
	public double getArea() {
		return height*width*0.5;
	}
	public String toString() {
		return "Shape: RightTriangle" +
						"\nArea: " + getArea();
	}
	public boolean equals(RightTriangle otherTri) {
		return (this.height == otherTri.height) && 
				(this.width == otherTri.height);
	}

}
