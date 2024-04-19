package myPackage;

public class Ex7_2b {
	public static void main(String[] args) {
		double[][] arr = 
			{//row:   0    1    2
					{1.2, 3.5, 6.2}, // column 0
					{4.6, 4.2, 8.9}, // column 1
					{8.5, 7.3, 1.8}  // column 2
			};
		
		System.out.print("getSum method of 1 row: ");
		System.out.printf("%.3f\n", Calculator.getSum(arr, 1));
		System.out.print("getAverage method of 1 column: ");
		System.out.printf("%.3f", Calculator.getAverage(arr, 1));

	}

}
