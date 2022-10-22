package java.lesson5;


import java.util.Arrays;

public class Lesson5Practice2 {

	public static void main(String[] args) {
		//Create an array of 1000 zeros. Change the value at index 42 to 42. Print out the array.
		int zeros1[] = new int[1000];
		zeros1[42] = 42;
		System.out.println(Arrays.toString(zeros1));
		
		/*
		 Create an array of 1000 zeros. 
		 Now change every value to its index so the array becomes {0,1,2,3...999}. 
		 Need to use a loop for this.
		 * */
		int zeros2[] = new int[1000];
		for(int i = 0; i < zeros2.length; i++) {
			zeros2[i] = i;
		}
		System.out.println(Arrays.toString(zeros2));
		
		/*
		 Create an array of Strings (create some values yourself). 
		 Then write some code that creates a new array of integers that holds the lengths of the Strings in the first array. 
		(Need to use .length() on all the Strings.)
		 * */
		String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};
		int stringLength[] = new int[cars.length];
		
		for(int i = 0; i < cars.length; i++) {
			stringLength[i] = cars[i].length();
		}
		System.out.println(Arrays.toString(stringLength));
	}
}
