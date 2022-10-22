package java.lesson11;
import java.util.ArrayList;
import java.util.List;

public class Lesson11Practice1 {

	public static void main(String[] args) {
		List<String> waterBodies = new ArrayList<String>();
		waterBodies.add("sea");
		waterBodies.add("ocean");
		waterBodies.add("river");
		waterBodies.add("pond");
		System.out.println(waterBodies);
		
		//Write a Java program to iterate through all elements in an array list and print them
		for (String waterBody : waterBodies) {
			System.out.println(waterBody);
		}
		
		//Write a Java program to insert an element into the ArrayList at the first position.
		waterBodies.set(0, "lake");
		
		//Write a Java program to retrieve an element (at a specified index) from a given ArrayList.
		System.out.println(waterBodies.get(0));
	}

}
