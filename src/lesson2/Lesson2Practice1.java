package lesson2;

class Lesson2Practice1 {

	public static void main(String[] args) {
		// Concatenate orange and apple
		System.out.println("orange" + "apple");
		System.out.println("orange".concat("apple"));
		
		// Check if "I am a String" contains the word "String"
		System.out.println("I am a String".contains("String"));
		
		// Compare String with different cases
		System.out.println("Java".equals("java"));
		// Ignoring the case
		System.out.println("Java".equalsIgnoreCase("java"));
	}

}
