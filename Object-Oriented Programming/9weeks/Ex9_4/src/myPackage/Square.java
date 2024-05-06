package myPackage;

public class Square extends Rectangle{
	public Square(int offset, int width) {
		super(offset, width, width);
		if (offset < 0 || width <= 0) {
			System.out.println("Wrong value(Square)");
			System.exit(0);
		}
	}
	
	
}
