package myPackage;

public class Ex6_2b {

	public static void main(String[] args) {
		Time time1 = new Time(3, 25, true);
		Time time2 = new Time(15, 25);
		
		//time1 test
		System.out.println("Current time by 24 format: " + time1.getTime24());
		System.out.println("Current time by 12 format: " + time1.getTime12());
		
		//time2 test
		System.out.println("Current time by 24 format: " + time2.getTime24());
		System.out.println("Current time by 12 format: " + time2.getTime12());

	}

}
