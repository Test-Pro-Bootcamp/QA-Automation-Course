package lesson11;
import java.util.ArrayList;
import java.util.List;

public class Lesson11Practice3 {

	public static void main(String[] args) {
		//Write a Java program to update specific array element by given element.
		String[] color = {"blue","green","yellow"};
		color[2] = "red";
		
		//Write a Java program to remove the third element from an ArrayList.
		List<String> waterBodies = new ArrayList<String>();
		waterBodies.add("sea");
		waterBodies.add("ocean");
		waterBodies.add("river");
		waterBodies.add("pond");
		System.out.println(waterBodies);
		
		waterBodies.remove(3);
		System.out.println(waterBodies);
		
		//Write a method with an ArrayList<Integer> parameter that removes all occurrences of the number 3
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(3);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		System.out.println(numberList);
		
		List<Integer> removeList = new ArrayList<Integer>();
		removeList.add(3);
		numberList.removeAll(removeList);
		System.out.println(numberList);
	}

}
