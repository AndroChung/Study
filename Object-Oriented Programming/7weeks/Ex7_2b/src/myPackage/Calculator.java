package myPackage;

public class Calculator {
	public static double getSum(double[][] arr, int row) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][row];
		}
		return sum;
	}
	public static double getAverage(double[][] arr, int column) {
		double sum = 0;
		double average;
		for (int i = 0; i < arr[column].length; i++) {
			sum += arr[column][i];
		}
		average = sum/(arr[column].length);
		return average;
	}
}
