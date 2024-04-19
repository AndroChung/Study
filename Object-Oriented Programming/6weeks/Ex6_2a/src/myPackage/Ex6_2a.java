package myPackage;

public class Ex6_2a {

	public static void main(String[] args) {
		Suit cardSuit = Suit.SPADES;
		
		System.out.println("cardSuit.ordinal(): " + cardSuit.ordinal());
		System.out.print("cardSuit.equals(Suit.CLUBS): ");
		if (cardSuit.equals(Suit.CLUBS)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println("cardSuit.compareTo(Suit.CLUBS): " + cardSuit.compareTo(Suit.CLUBS));
		System.out.println("Suit.valueOf(\"CLUBS\"): " + Suit.valueOf("CLUBS"));
		System.out.println("Suit.valueOf(cardSuit.toString()): " + Suit.valueOf(cardSuit.toString()));
		System.out.println("cardSuit.getColor(): " + cardSuit.getColor());
		System.out.println("cardSuit.toString(): " + cardSuit.toString());
	}
	

}
