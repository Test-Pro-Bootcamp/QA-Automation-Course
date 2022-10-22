package java.lesson2;

public class Lesson2Practice2 {

	public static void main(String[] args) {
		// How many characters are in the string
		System.out.println("I am a string".length());
		
		//Compare strings �Cat� and �CAT� ignoring case.
		System.out.println("Cat".equalsIgnoreCase("CAT"));
		
		//concatenate 2 strings
		System.out.println(concatenate("Test", "Pro"));
		
		//Return true if the String contains �cat� and �dog�, false otherwise.
		System.out.println(contains("dog"));
		System.out.println(contains("cat"));
	}

	private static String concatenate(String str1, String str2) {
		return str1.concat(str2);
	}
	
	private static boolean contains(String str) {
		return "cat".contains(str);
	}
}
