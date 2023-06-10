package test;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		
		String str = "Anil Kumarrrrrrrrrr";
		
		char [] ch = str.toCharArray();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		Set<Character> set = new LinkedHashSet<>();
		
		for(Character c : ch) {
			set.add(c);
		}
		System.out.println(set);

	}

}
