package myPackage;

public class RightTriangle extends ShapeBase{
	private double width, height;
	// width must be odd
	RightTriangle(int offset, double width) {
		if (offset < 0 || width <= 0 || (width%2 == 0)) {
			System.out.println("Wrong value(RightTriangle)");
			System.exit(0);
		}
		setOffset(offset);
		this.width = width;
		this.height = width*(Math.sqrt(3)/2.0);
	}
	public double getArea() {
		return 0.5*width*height;
	}
	public double getCircumference() {
		return 3*width;
	}
	public void skipSpaces(int offset) {
		for (int count = 0; count < offset; count++)
			System.out.print(" ");
	}
	private void drawTop() {
		skipSpaces(getOffset() + (int)(width/2));
		System.out.println("*");
	}
	private void drawSides() {
		for (int count = 0; count < (int)(width/2 - 1); count++) {
			skipSpaces(getOffset() + (int)(width/2) - (count+1));
			System.out.print("*");
			skipSpaces(2*(count) + 1);
			System.out.println("*");
		}
	}
	private void drawBottom() {
		skipSpaces(getOffset());
		for (int count = 0; count < width; count++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public void drawHere() {
		drawTop();
		drawSides();
		drawBottom();
	}
	
}
