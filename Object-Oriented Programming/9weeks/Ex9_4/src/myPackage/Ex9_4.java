package myPackage;

public class Ex9_4 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 5, 3);
		r1.drawAt(5);
		System.out.println("Area of r1: " + r1.getArea());
		
		Square s1 = new Square(5, 10);
		s1.drawAt(1);
		System.out.println("Area of s1: " + s1.getArea());
		
		RightTriangle t1 = new RightTriangle(5, 31);
		t1.drawAt(1);
		System.out.println("Area of t1: " + t1.getArea());

	}

}
