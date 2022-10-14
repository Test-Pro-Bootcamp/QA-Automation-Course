package lesson7;


public class Lesson7Practice1 {

	public static void main(String[] args) {
		//Create an integer and try to divide by zero. Run and observe what happens.

		//Create a String and give it some value. Now use the charAt() method to try to access a character at an index larger than the size of the string. Run and observe what happens.

		//Put your code in 1. and 2. in try-catch blocks to avoid crashing the program. 

		try {
			int num = 10 / 0;
			
			String str = "Im a String";
			str.charAt(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
			Create a method that throws an exception with message (“I am throwing an exception!”). 
			Then call that method in main with a try-catch block and print out the message. 
		 * */
		try {
			exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void exception() throws Exception{
		new Exception("I am throwing an exception!");
	}

}
