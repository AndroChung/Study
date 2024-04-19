package myPackage;

public class Polynomial {
	private int n;
	private double[] coefficients;
	
	Polynomial(int degreeMax) {
		n = degreeMax;
		coefficients = new double[n+1];		
	}
	public void setConstant(int i, double value) {
		coefficients[i] = value;
	}
	public double evaluate(double x) {
		double sum = 0;
		for (int i = 0; i < coefficients.length; i++) {
			sum += Math.pow(x, i)*coefficients[i];
		}
		return sum;
	}

}
