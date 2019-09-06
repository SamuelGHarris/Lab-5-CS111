/**
* CS 111 Section No.002
* Lab Assignment 5
* @author Samuel Harris 
**/

import java.util.Scanner;

public class GroceryCart {
	public static void main(String args[]) {
		int numItems = 0;
		String search = null;
		String[] names = null;
		Double[] prices = null;
		Scanner input = new Scanner(System.in);

		//Arrays are initialized according to the users input.
		System.out.println("How many items are you going to buy today?");
		numItems = input.nextInt();
		input.nextLine();
		names = new String[numItems];
		prices = new Double[numItems];

		//Arrays are filled with the users input.
		for (int i = 0; i < names.length; i++) {
			System.out.println("What is item " + (i + 1));
			names[i] = input.nextLine();
			System.out.println("What is the price of " + names[i] + "?");
			prices[i] = input.nextDouble();
			input.nextLine();
		}

		//Objects are made of the AnyArray class with their according types.
		AnyArray<String> nameList = new AnyArray<String>(names);
		AnyArray<Double> priceList = new AnyArray<Double>(prices);

		System.out.println(nameList.toString());
		System.out.println(priceList.toString());

		System.out.println("Please enter the name for the item that you want to search for.");
		search = input.nextLine();

		/*Determines if the item was found in the array.
		 If found, the price is printed.
		 If not, "Item not found" is printed.*/
		if (nameList.findLocation(search) != -1) {
			System.out.println(priceList.getIth(nameList.findLocation(search)));
		} else {
			System.out.println("Item not found");
		}
	}
}
