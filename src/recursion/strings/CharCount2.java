package recursion.strings;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharCount2 {

	private static List<Character> list;
	private static int idx;

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String one  = scan.nextLine();
		System.out.println("Enter another String : ");
		String two  = scan.nextLine();
		int count = 0, idx = 0, idx1 = 0, idx2 = 0;
		char [] ch1 = one.toCharArray();
		char [] ch2 = two.toCharArray();
		List<Character> list = new LinkedList<>();
		List<Character> list2 = new LinkedList<>();
		
		charCount(ch1, ch2, list, list2 , count, idx1, idx2, idx);

	}

	private static void charCount(char [] ch1, char [] ch2, List<Character> list, List<Character> list2, int count, int idx1, int idx2, int idx) {
		if(idx1 == list2.size()) {
			return;
		}
		if(idx1 < ch2.length) {
			idx2 = 0;
			counter(ch1, idx1, idx2, list2, count);
			System.out.println(list2.get(idx1)+" - "+count);
			count = 0;
		}
		charCount(ch1, ch2, list, list2 , count, ++idx1, idx2, idx);
	}
	
	private static int counter(char [] ch1, int idx1, int idx2, List<Character> list2, int  count) {
		if(idx2 == ch1.length) 
			return count;
		
		if(idx1 == 0) 
			remove(ch1, list, idx);
		
		if(list2.get(idx1) == ch1[idx2]) 
			count++;

		return counter(ch1, idx1, ++idx2, list2, count);
	}
	
	private static List<Character> remove(char [] ch2, List<Character> list, int idx) {
		if(idx == ch2.length) {
			List<Character> list2 = list.stream().distinct().collect(Collectors.toList());
			return list2;
		}
		list.add(ch2[idx]);
		
		return remove(ch2, list, ++idx);
	}

}
