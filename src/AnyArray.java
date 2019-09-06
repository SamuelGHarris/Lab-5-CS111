/**
* CS 111 Section No.002
* Lab Assignment 5
* @author Samuel Harris 
**/

public class AnyArray <T>{
	private T[] arr;
	private int size;
	
	//Default Constructor
	public AnyArray() {
		this.arr = null;
		this.size = 0;
	}
	
	//Parameterized Constructor
	public AnyArray(T[] input) {
		this.arr = input;
		this.size = input.length;
	}
	
	//Returns the element at a given index (i) if i is within the bounds of the array.
	public T getIth(int i) {
		if (i < 0 || i > (arr.length-1)) {
			return null;
		}
		return (arr[i]);
	}
	
	/*Returns the index of the given value as long as there is a match.
	 -1 is returned if there is not a match.*/
	public int findLocation(T query) {
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i].equals(query)) {
				index = i;
			}
		}
	return index;
	}
	
	//Prints the array with one element on each line.
	public void printArray() {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//Prints the data members out in string form.
	public String toString() {
		return ("This list has " + size + " elements with the first item: " + getIth(0)
				+ " and the last item: " + getIth(arr.length-1));
	}
}
