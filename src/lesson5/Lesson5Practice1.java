package lesson5;


import java.util.Arrays;

public class Lesson5Practice1 {

	public static void main(String[] args) {
		//Create an array of integers with value: {1,2,3,4}.
		int intArray[] = {1,2,3,4};
		
		//Print out the first (index 0) integer;
		System.out.println(intArray[0]);
		//Print out the length of the array;
		System.out.println(intArray.length);
		//Print out the last integer;
		System.out.println(intArray[intArray.length - 1]);
		//Print out every integer in the array with a loop;
		for(int num : intArray) {
			System.out.print(num);
		}
		
		System.out.println("");
		
		//Create an array of Strings : {"red", "green", "blue", "white", "pink"}.
		String colors[] = {"red", "green", "blue", "white", "pink"};
		
		//Print out the length of the array;
		System.out.println(colors.length);
		//Use Arrays.toString() to print out the whole array; 
		System.out.println(Arrays.toString(colors));
		//Change "green" to "black" and print out the array again;
		colors[1] = "black";
		System.out.println(Arrays.toString(colors));
		//Change "pink" to "red" and print out the array again;
		colors[4] = "red";
		System.out.println(Arrays.toString(colors));
	}

}
