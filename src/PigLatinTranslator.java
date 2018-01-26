import java.util.Scanner;

public class PigLatinTranslator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userAnswer = "y";

		System.out.println("Welcome to the Pig Latin Translator! \n");
		do {
			System.out.println("Enter a line to be translated: ");
			String userInput = scan.nextLine();
			userInput = userInput.toLowerCase();
			System.out.print("\n" + "The Pig Latin version of " + userInput + " is: ");
			pigLatinsent(userInput);
			System.out.println("\n");
			System.out.println("Would you like to translate another word? y/n");
			userAnswer = scan.nextLine();
		} while (userAnswer.equalsIgnoreCase("y"));

	} 

	public static String pigLatin(String word) {

		char findVowel = word.charAt(0);
		if (findVowel == 'a' || findVowel == 'e' || findVowel == 'i' || findVowel == 'o' || findVowel == 'u') {
			word = word.concat("way");

		} else {
			String findcons = "";
			if (word.charAt(1) == 'h') {
				findcons = word.substring(0, 2);
				word = word.concat(findcons).concat("ay");
				word = word.substring(2);
			} else {
				findcons = String.valueOf(findVowel);
				word = word.concat(findcons).concat("ay");
				word = word.substring(1);
			}

		}
		return word;
	}

	public static void pigLatinsent(String word) {
		String s = word;
		String[] strArray = s.split(" ");
		for (int i = 0; i < strArray.length; i++) 
			System.out.print(pigLatin(strArray[i]) + " ");
		
		
	}

}