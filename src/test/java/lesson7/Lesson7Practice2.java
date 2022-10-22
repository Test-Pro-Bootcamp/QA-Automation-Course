package lesson7;


public class Lesson7Practice2 {

	public static void main(String[] args) {
		try {
			lengthCheck("Is this string greater than 10.");
			
			sum(90, 20);
			
			booleanCheck(true);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create a method that has one String as an input parameter. 
	 * If the length of the String is greater than 10, throw an exception with message �string too long!�. 
	 * Call the method in the main() method. 
	 */
	private static void lengthCheck(String str) throws Exception{
		if(str.length() > 10) {
			throw new Exception("string too long!");
		}
	}

	/**
	 * Create a method that has two integers as input parameters. 
	 * If the sum of the two integers is greater than 100, throw an exception with message �sum can�t be greater than 100�. 
	 * Call the method in the main() method.
	 */
	private static void sum(int num1, int num2) throws Exception{
		if((num1 + num2) > 100) {
			throw new Exception("sum can�t be greater than 100");
		}
	}
	
	/**
	 * Create a method that has one boolean as an input parameter. If the boolean is true throw an exception.
	 */
	private static void booleanCheck(boolean bool) throws Exception{
		if(bool) {
			throw new Exception("Boolean received is true");
		}
	}
}
