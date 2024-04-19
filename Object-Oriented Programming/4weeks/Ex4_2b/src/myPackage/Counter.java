package myPackage;

public class Counter {
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if (count >= 0) this.count = count;
		else System.out.println("Wrong! please Enter non-negative count");
	}
	
	public void increase() {
		count++;
	}
	
	public void decrease() {
		if (count > 0) count--;
		else System.out.println("Cant decrease!");
	}
	
	public void reset() {
		count = 0;
	}
	
}
