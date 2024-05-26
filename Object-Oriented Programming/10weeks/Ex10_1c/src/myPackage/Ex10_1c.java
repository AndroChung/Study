package myPackage;

public class Ex10_1c {

	public static void main(String[] args) {
		RegularPay r1 = new RegularPay(9700);
		RegularPay r2 = new RegularPay(10200);
		HazardPay h1 = new HazardPay(9700);
		HazardPay h2 = new HazardPay(10200);
		
		System.out.println("Total regular pay of r1 working for 8hours: " +
						r1.computePay(8));
		System.out.println();
		System.out.println("Total regular pay of r2 working for 8hours: " +
				r2.computePay(8));
		System.out.println();
		System.out.println("Total hazard pay of h1 working for 8hours: " +
				h1.computePay(8));
		System.out.println();
		System.out.println("Total hazard pay of h2 working for 8hours: " +
				h2.computePay(8));

	}

}
