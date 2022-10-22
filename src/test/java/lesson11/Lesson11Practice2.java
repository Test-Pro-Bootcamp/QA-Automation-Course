package lesson11;
import java.util.ArrayList;
import java.util.List;

public class Lesson11Practice2 {

	public static void main(String[] args) {
		//Initialize an ArrayList. Using a For loop add integers from 1 to 10.
		List<Integer> numberList = new ArrayList<>();
		for (int i = 1; i<= 10; i++) {
			numberList.add(i);
		}
		System.out.println(numberList);
		
		//Create an ArrayList[1,2,3,6,7,3,2,1]. Remove all numbers divisible by 2's from the list
		List<Integer> evenList = new ArrayList<Integer>();
		for (Integer number : numberList) {
			if(number%2 == 0) {
				evenList.add(number);
			}
		}
		numberList.removeAll(evenList);
		System.out.println(numberList);
		
		//Remove all odd number
		List<Integer> oddList = new ArrayList<Integer>();
		for (Integer number : numberList) {
			if(number%2 != 0) {
				oddList.add(number);
			}
		}
		numberList.removeAll(oddList);
		System.out.println(numberList);
	}

}
