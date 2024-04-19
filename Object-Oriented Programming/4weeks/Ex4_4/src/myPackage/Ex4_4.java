package myPackage;

public class Ex4_4 {

	public static void main(String[] args) {
		Purchase purchase = new Purchase();
		
		purchase.readInput();
		System.out.println("Current Total Bills: " +
							purchase.getTotalCost() + "$");
		
		

	}

}
