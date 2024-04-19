package myPackage;

public class CharacteristicDemo {

	public static void main(String[] args) {
		Characteristic character1 = new Characteristic("rich");
		Characteristic character2 = new Characteristic("rich");
		Characteristic character3 = new Characteristic("cuty");		
		character1.setRating(5);
		character2.setRating(7);
		character3.setRating(8);
		
		System.out.println("Character1 description: " + character1.getDescription()
						+ "Character1 rating: " + character1.getRating());
		System.out.println("Character2 description: " + character2.getDescription()
						+ "Character2 rating: " + character2.getRating());
		System.out.println("Character3 description: " + character3.getDescription()
						+ "Character3 rating: " + character3.getRating());
		
		// If match
		System.out.println("Compatibility between Character1 and Character2: "
				+ character1.getCompatibility(character2));
		
		// If not match
		System.out.println("Compatibility between Character1 and Character3: "
				+ character1.getCompatibility(character3));
	}

}
