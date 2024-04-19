package myPackage;

public class Ex7_2c {

	public static void main(String[] args) {
		Polynomial expression1 = new Polynomial(3);
		
		expression1.setConstant(0, 3);
		expression1.setConstant(1, 5);
		expression1.setConstant(3, 2); // P(x) = 3 + 5x + 2x**3
		System.out.println("For expression1 P(3) = " + expression1.evaluate(3));
		System.out.println("For expression1 P(6) = " + expression1.evaluate(6));
		
		Polynomial expression2 = new Polynomial(5);
		
		expression2.setConstant(0, 7);
		expression2.setConstant(2, 2);
		expression2.setConstant(4, 6.5);
		expression2.setConstant(5, 4.8); // P(x) = 7 + 2x**2 + 6.5x**4 + 4.8x**5
		System.out.println("For expression2 P(2) = " + expression2.evaluate(2));
		System.out.println("For expression2 P(3) = " + expression2.evaluate(3));

	}

}
