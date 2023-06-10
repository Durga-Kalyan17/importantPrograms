package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author DurgaKalyan
 * 
 * String s = "Today Is Saturday";
 * O/P: Saturday Is Today
 * 
 */
public class LastWordToFirst {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = scan.nextLine();
		int count1 = 0, count2 = 0;
		
		lastWordToFirstWord(s, count1, count2);
	}

	/**
	 * Method to swap first and last words of string
	 * @param s
	 * @param count1
	 * @param count2
	 * 
	 */
	private static void lastWordToFirstWord(String s, int count1, int count2) {
		for(int i = s.length() - 1; i >= 0; i--) {
			count1++;
			if(s.charAt(i) == ' ') {
				count1--;
				break;
			}
		}
		
		for(int i = s.length() - count1; i < s.length(); i++) 
			System.out.print(s.charAt(i));
		
		for(int i = 0; i < s.length(); i++) {
			count2++;
			if(s.charAt(i) == ' ') 
				 break;
		}
		
		for(int i = count2 - 1; i < s.length() - count1; i++)
			System.out.print(s.charAt(i));
		
		for(int i = 0; i < count2; i++) 
			System.out.print(s.charAt(i));
		
	}
	

}
