package myPackage;

public class Ex5_10 {

	public static void main(String[] args) {
		Movie harrypotter = new Movie();
		Movie avengers = new Movie();
		
		harrypotter.name = "Harry Potter";
		harrypotter.MPAA = "U";
				
		avengers.name = "The Avengers";
		avengers.MPAA = "PG-13";
		
		harrypotter.addRating(5);
		harrypotter.addRating(4);
		harrypotter.addRating(4);
		harrypotter.addRating(2);
		harrypotter.addRating(3);
		
		avengers.addRating(5);
		avengers.addRating(5);
		avengers.addRating(5);
		avengers.addRating(4);
		avengers.addRating(5);
		
		System.out.println("The Movie Name: " + harrypotter.name +
							"\nThe MPAA Rating: " + harrypotter.MPAA +
							"\nThe Average Rating: " + harrypotter.getAverage(harrypotter));
		System.out.println();
		System.out.println("The Movie Name: " + avengers.name +
				"\nThe MPAA Rating: " + avengers.MPAA +
				"\nThe Average Rating: " + avengers.getAverage(avengers));
		System.out.println();
		
		System.out.println("Are these movies same?: ");
		if (harrypotter.equals(avengers)) {
			System.out.println("Same");
		} else {
			System.out.println("No");
		}

	}

}
