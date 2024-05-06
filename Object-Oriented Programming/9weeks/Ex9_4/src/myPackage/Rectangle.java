package myPackage;

public class Rectangle extends ShapeBase {
	private int width, height;
	public Rectangle(int offset, int width, int height) {
		if (offset < 0 || width <= 0 || height <= 0) {
			System.out.println("Wrong value(Rectangle)");
			System.exit(0);
		}
		setOffset(offset);
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return width*height;
	}
	public double getCircumference() {
		return 2*(width + height);
	}
	private void skipSpaces(int offset) {
		for (int count = 0; count < offset; count++) 
			System.out.print(" ");
	}
	private void drawHorizontalLine() {
		skipSpaces(getOffset());
		for (int count = 0; count < width; count++)
			System.out.print("-");
		System.out.println();
	}
	private void drawOneLineOfSides() {
		skipSpaces(getOffset());
		System.out.print("|");
		skipSpaces(width - 2);
		System.out.println("|");
	}
	private void drawSide() {
		for (int count = 0; count < height - 2; count++) {
			drawOneLineOfSides();
		}
	}
	public void drawHere() {
		drawHorizontalLine();
		drawSide();
		drawHorizontalLine();
	}
	
	
}
