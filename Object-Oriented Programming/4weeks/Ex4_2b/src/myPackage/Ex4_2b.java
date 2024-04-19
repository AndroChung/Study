package myPackage;
import java.util.Scanner;

public class Ex4_2b {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the count:");
		counter.setCount(key.nextInt());
		System.out.println("Count you enter: ");
		
		counter.setCount(10);
		System.out.println("Count: " + counter.getCount());
		
		counter.increase();
		counter.increase();
		System.out.println("Count: " + counter.getCount());
		
		counter.decrease();
		System.out.println("Count: " + counter.getCount());
		
		counter.reset();
		System.out.println("Count: " + counter.getCount());
		
		counter.decrease();
		counter.setCount(-10);
		
		key.close();

	}

}
