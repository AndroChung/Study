package myPackage;

public class Ex7_3 {

	public static void main(String[] args) {
		int[] array = {44, 62, 35, 12, 84, 382, 93, 87, 53};
		
		System.out.println("Bubble sorting");
		display(array, "before");
		ArraySorter.bubbleSort(array);
		display(array, "after");
		

	}
	
	public static void display(int[] array, String when) {
		System.out.println("Array values " + when + " sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
