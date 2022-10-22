package lesson3;


public class Lesson3Practice3 {

	public static void main(String[] args) {
		oddEven(11);
		System.out.println(largest(1, 2, 3));
	}

	/*
	 Write a method that has one integer input parameter. 
	 It does not return anything so put 'void' as the return type. 
	 Print "odd" if the integer is odd and "even" otherwise.
	 */
	
	private static void oddEven(int number) {
		int remainder = number % 2;
		
		switch (remainder) {
		case 0:
			System.out.println("even");
			break;
		default:
			System.out.println("odd");
			break;
		}
	}
	
	
	/*
	 Write a method that has 3 integer input parameters, return the largest one.
	 * */
	
	private static int largest(int num1, int num2, int num3) {
		if(num1 > num2 && num1 > num3) {
			return num1;
		}
		else if(num2 > num1 && num2 > num3) {
			return num2;
		}
		else {
			return num3;
		}
	}
}
