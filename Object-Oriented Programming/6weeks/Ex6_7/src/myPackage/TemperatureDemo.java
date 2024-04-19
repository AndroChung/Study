package myPackage;

public class TemperatureDemo {

	public static void main(String[] args) {
		Temperature temp1 = new Temperature();
		Temperature temp2 = new Temperature(-40, 'F');
		Temperature temp3 = new Temperature(100, 'C');
		
		System.out.println("temp1");
		System.out.println("In Celsius: " + temp1.getCelsius());
		System.out.println("In Fahrenheit: " + temp1.getFahrenheit());
		
		System.out.println("temp2");
		System.out.println("In Celsius: " + temp2.getCelsius());
		System.out.println("In Fahrenheit: " + temp2.getFahrenheit());
		
		System.out.println("temp3");
		System.out.println("In Celsius: " + temp3.getCelsius());
		System.out.println("In Fahrenheit: " + temp3.getFahrenheit());
		
		System.out.print("temp1 and temp2 are equal? : ");
		if (temp1.isEqual(temp2)) {
			System.out.println("True");
		} else
		{
			System.out.println("False");
		}
		
		System.out.print("temp3 is greater than temp2? : ");
		if (temp3.isGreater(temp2)) {
			System.out.println("True");
		} else
		{
			System.out.println("False");
		}
		
		System.out.print("temp2 is less than temp1? : ");
		if (temp2.isLess(temp1)) {
			System.out.println("True");
		} else
		{
			System.out.println("False");
		}
	}

}
