package myPackage;

public class Grade {
	private int A, B, C, D, F;

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public int getC() {
		return C;
	}

	public void setC(int c) {
		C = c;
	}

	public int getD() {
		return D;
	}

	public void setD(int d) {
		D = d;
	}

	public int getF() {
		return F;
	}

	public void setF(int f) {
		F = f;
	}
	
	private class Star {
		private int sum = A + B + C + D + F;
		private int AStar = (int)Math.round(((A/(double)sum)*100)/2);
		private int BStar = (int)Math.round(((B/(double)sum)*100)/2);
		private int CStar = (int)Math.round(((C/(double)sum)*100)/2);
		private int DStar = (int)Math.round(((D/(double)sum)*100)/2);
		private int FStar = (int)Math.round(((F/(double)sum)*100)/2);
	}
		
	
	public void percentage() {
		Star star = new Star();
		for(int i = 0; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for(int a = 0; a < star.AStar; a++) {
			System.out.print("*");
		}
		System.out.println(" A");
		for(int b = 0; b < star.BStar; b++) {
			System.out.print("*");
		}
		System.out.println(" B");
		for(int c = 0; c < star.CStar; c++) {
			System.out.print("*");
		}
		System.out.println(" C");
		for(int d = 0; d < star.DStar; d++) {
			System.out.print("*");
		}
		System.out.println(" D");
		for(int f = 0; f < star.FStar; f++) {
			System.out.print("*");
		}
		System.out.println(" F");
	}

}
