package lesson11;
public class Lesson11Practice4 {

	public static void main(String[] args) {
		System.out.println(isPalidrome("Dad"));
		System.out.println(isPalidrome("Racecar"));
		System.out.println(isPalidrome(cleanString("Eva, can I see bees in a cave?")));
	}

	private static boolean isPalidrome(String str) {
		boolean isPalidrome = true;
		char[] charArray = str.toLowerCase().toCharArray();
		
		for(int i=0, j=charArray.length-1; i<charArray.length; i++, j--) {
			if(charArray[i] !=charArray[j]) {
				isPalidrome = false;
				break;
			}
		}
		
		return isPalidrome;
	}
	
	private static String cleanString(String str) {
		char[] charArray = str.toLowerCase().toCharArray();
		String cleanString = "";
		
		for(char ch : charArray) {
			if(Character.isLetter(ch)) {
				cleanString += ch;
			}
		}
		
		return cleanString;
	}
}
