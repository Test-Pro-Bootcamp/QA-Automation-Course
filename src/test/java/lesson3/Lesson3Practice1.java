package java.lesson3;


public class Lesson3Practice1 {

	public static void main(String[] args) {
		/*
		 Create a boolean variable called 'test_passed' (let's say you ran some automated test and the result is true or false). 
		 Use if-else to print "test passed" if it is true and "test failed" if it is false.
		 */
		
		boolean test_passed = true;
		
		if(test_passed) {
			System.out.println("test passed");
		}else {
			System.out.println("test failed");
		}
		
		
		/*
		 Create an integer variable 'a' and give it a value. 
		 Print "Less than 100" if it is less than 100, print "100 or greater" otherwise. 
		 Change the value of 'a' and observe the difference in output. 
		 */
		
		int a = 10;
		
		if(a < 100) {
			System.out.println("Less than 100");
		}else {
			System.out.println("100 or greater");
		}
	}

}
