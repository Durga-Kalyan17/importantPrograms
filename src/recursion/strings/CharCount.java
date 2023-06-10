package recursion.strings;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharCount {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String one  = scan.nextLine();
		System.out.println("Enter another String : ");
		String two  = scan.nextLine();
		int count = 0;
		
		charCount(one, two, count);
		
	}

	private static void charCount(String one, String two, int count) {
		char [] ch1 = one.toCharArray();
		char [] ch2 = two.toCharArray();
		
		List<Character> list = new LinkedList<>();
		for(Character ch : ch2){
			list.add(ch);
		}
		
		List<Character> list2 = list.stream().distinct().collect(Collectors.toList());
		
		for(int i = 0;i < list2.size();i++) {
			count  = 0;
			for(int j = 0;j < one.length();j++) {
				if(list2.get(i) == ch1[j]) {
					count++;
				}
			}
			System.out.println(list2.get(i)+" - "+count);
			
		}
		
	}

}
