package myPackage;

public class Characteristic {
	private String description;
	private int rating;
	
	Characteristic(String description) {
		this.description = description;
		rating = 0;
	}
	
	private boolean isValid(int aRating) {
		return 1 <= aRating && aRating <= 10;
	}
	public void setRating(int rating) {
		if (isValid(rating)) {
			this.rating = rating;
		}
	}
	public String getDescription() {
		return description;
	}
	public int getRating() {
		return rating;
	}
	private double getCompatibilityMeasure(Characteristic otherRating) {
		if (rating == 0 || otherRating.rating == 0) {
			return 0;
		} else 
			return 1 - Math.pow(otherRating.rating - rating, 2)/81;
	}
	private boolean isMatch(Characteristic otherRating) {
		return description == otherRating.description;
	}
	public double getCompatibility(Characteristic otherRating) {
		if (isMatch(otherRating)) {
			return getCompatibilityMeasure(otherRating);
		} else 
			return 0;
	}
}
