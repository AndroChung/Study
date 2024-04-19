package myPackage;

public class Movie {
	public String name;
	public String MPAA;
	private int terrible = 0, bad =0, 
			ok = 0, good = 0, great = 0;
	
	public void addRating(int number) {
		if (number < 1 || number > 5) {
			System.out.println("Wrong number");
			return;
		}
		switch(number) {
			case 1:
				terrible++;
				break;
			case 2:
				bad++;
				break;
			case 3:
				ok++;
				break;
			case 4:
				good++;
				break;
			default:
				great++;
		}
	}
	public double getAverage(Movie object) {
		if (terrible + bad + ok + good + great < 5) {
			System.out.println("Insufficient numbers of rating");
			return 0; 
		}
		int sum = terrible + bad*2 + 
				ok*3 + good*4 + great*5;
		double average;
		
		average = sum / 5.0;
		return average;
	}
	public boolean equals(Movie object) {
		return this.name == object.name && this.MPAA == object.MPAA;
	}

}
