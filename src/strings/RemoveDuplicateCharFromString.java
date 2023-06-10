package strings;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharFromString {

	public static void remove(String str) {
		int count  = 0;
		for(int i = 0; i < str.length(); i++) {
			count = 0;
			for(int j = i + 1; j < str.length(); j++) {
				
				if(str.charAt(i) == str.charAt(j)) 
					count++;
			}
			//System.out.println("count - " + count);
			if(count == 0)
				System.out.print(str.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = scan.nextLine();
		
		System.out.println();
		
		remove(str);
		System.out.println();
		System.out.println();
		removeUsingSet(str);
		
	}

	private static void removeUsingSet(String str) {
		
		Set<Character> set = new LinkedHashSet<>();

		for(int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		System.out.println("Set - " + set);
		
	}
}
