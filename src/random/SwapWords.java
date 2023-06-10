package random;

import java.util.Scanner;

/**
 * @author DurgaKalyan
 * 
 * String s = "Today Is Saturday";
 * O/P: Saturday Is Today
 * 
 */
public class SwapWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = scan.nextLine();
		int count1 = 0, count2 = 0;
		
		countWordSize(s, count1, count2);
		firstWord(s);

	}
	
	/**
	 * method to print firstWord
	 * @param s
	 * 
	 */
	private static void firstWord(String s) {
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			if(s.charAt(i) == ' ')
				break;
		}
	}

	/**
	 * method to count each word size
	 * @param s
	 * @param count1
	 * @param count2
	 * 
	 */
	private static void countWordSize(String s, int count1, int count2) {
		for(int i = s.length() - 1; i >= 0; i--) {
			count1++;
			count2++;
			if(s.charAt(i) == ' ') {
				printWord(s, count1, count2);
				count2 = 0;
			}
		}
		
	}

	/**
	 * method to print each character of the String
	 * @param s
	 * @param count1
	 * @param count2
	 * 
	 */
	private static void printWord(String s, int count1, int count2) {
		for(int j = s.length() - count1 + 1; j < (s.length() - count1) + count2; j++) 
			System.out.print(s.charAt(j));
		
		System.out.print(" ");
	}

}
