package strings;

import java.util.Scanner;

public class ReverseEachWordInSentence {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a sentence :");
		String sentence = scan.nextLine();
		
		reverseEachWordInSentence(sentence);
	}

	private static void reverseEachWordInSentence(String sentence) {
		
		String reverse = "";
		int count = 0;
		
		for(int i = 0; i < sentence.length(); i++) {
			
			if(sentence.charAt(i) == ' ' || i == sentence.length() - 1) {
				for(int j = i; j >= count; j--) 
					reverse = reverse + sentence.charAt(j);
				
				count = i;
			}
			
			
		}
		System.out.println("\nOutput :\n" + reverse.trim());
				
	}

}
