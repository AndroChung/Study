package myPackage;

public class Ex10_1b {

	public static void main(String[] args) {
		Shape[] s = new Shape[] {
				new Rectangle(7, 10),
				new RightTriangle(5),
				new Circle(3)
		};
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString());
		}

	}

}
