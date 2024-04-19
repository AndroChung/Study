package myPackage;

public class Temperature {
	double degree;
	char scale;
	Temperature() {
		degree = 0.0;
		scale = 'C';
	}
	Temperature(double degree) {
		this.degree = degree;
		scale = 'C';
	}
	Temperature(char scale) {
		degree = 0.0;
		this.scale = Character.toUpperCase(scale);
	}
	Temperature(double degree, char scale) {
		this.degree = degree;
		this.scale = Character.toUpperCase(scale);
	}
	
	// accessor methods
	public double getCelsius() {
		if (scale == 'C') {
			return Math.round(degree*10)/10.0;
		} else {
			double celsius = 5*(degree - 32)/9.0;
			celsius = Math.round(celsius*10)/10.0;
			return celsius;
		}
	}
	public double getFahrenheit() {
		if (scale == 'F') {
			return Math.round(degree*10)/10.0;
		} else {
			double fahrenheit = (9*degree)/5.0 + 32;
			fahrenheit = Math.round(fahrenheit*10)/10.0;
			return fahrenheit;
		}
	}
	
	// mutator methods
	public void setDegree(double degree) {
		this.degree = degree;
	}
	public void setScale(char scale) {
		this.scale = Character.toUpperCase(scale);
	}
	public void setTemperature(double degree, char scale) {
		this.degree = degree;
		this.scale = Character.toUpperCase(scale);
	}
	
	// comparison two degree
	public boolean isEqual(Temperature temp) {
		return getCelsius() == temp.getCelsius();
	}
	public boolean isGreater(Temperature temp) {
		return getCelsius() > temp.getCelsius();
	}
	public boolean isLess(Temperature temp) {
		return getCelsius() < temp.getCelsius();
	}
	
}
