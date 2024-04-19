package myPackage;
import java.util.Scanner;

public class Purchase {
	private String name;
	private int groupCount;
	private double groupPrice;
	private double totalCost = 0;
	
	private int numberBought;
	public void setName(String newName)
	{
		name = newName;
	}
	/**
	 Sets price to count pieces for $costForCount.
	 For example, 2 for $1.99.
	 */
	public void setPrice(int count, double costForCount) {
		if ((count <= 0) || (costForCount <= 0)) 
		{
			System.out.println("Error: Bad parameter in " + "setPrice.");
			System.exit(0);
		}
		else
		{
			groupCount = count;
			groupPrice = costForCount;
		}
	}
	public void setNumberBought(int number)
	{
		if (number <= 0) 
		{
			System.out.println("Error: Bad parameter in " + "setNumbberBought.");
			System.exit(0);
		}
		else
		{
			numberBought = number;
		}
	}
	/**
	 Reads from keyboard the price and number of a purchase.
	 */
	public void readInput()
	{
		while(true) 
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter name of item you are purchasing:");
			name = keyboard.nextLine();
			if (name != "") 
			{
				setName(name);
			} else
			{
				return;
			}
			System.out.println("Enter price of item as two numbers.");
			System.out.println("For exaple, 3 for $2.99 os entered as");
			System.out.println("3 2.99");
			System.out.println("Enter price of item as two numbers, " +
			"now:");
			groupCount = keyboard.nextInt();
			groupPrice = keyboard.nextDouble();
			
			while ((groupCount <= 0) || (groupPrice <= 0))
			{ //Try again:
				System.out.println("Both numbers must " +
									"be positive. Try again");
				System.out.println("Enter price of " +
						 			"item as two numbers.");
				System.out.println("For example, 3 for " +
						 			"$2.99 is entered as");
				System.out.println("3 2.99");
				System.out.println("Enter price of item as two numbers, now:");
				groupCount = keyboard.nextInt();
				groupPrice = keyboard.nextDouble();
			}
			System.out.println("Enter number of items purchased:");
			numberBought = keyboard.nextInt();
			
			while (numberBought <= 0)
			{ //Try again:
				System.out.println("Number must be positive. " +
									"Try again.");
				System.out.println("Enter number of items purchased:");
				numberBought = keyboard.nextInt();
			}
			totalCost += (groupPrice / groupCount) * numberBought;
			writeOutput();
			}
		
	}
	/**
	 Displays price and number being purchased.
	 */
	public void writeOutput()
	{
		System.out.println(numberBought + " " + name);
		System.out.println("at " + groupCount +
							" for $" + groupPrice);	
	}
	public String getName()
	{
		return name;
	}
	public double getTotalCost()
	{
		return totalCost;
	}
	public double getUnitCost() 
	{
		return groupPrice / groupCount;
	}
	public int getNumberBought()
	{
		return numberBought;
	}
	
	
}