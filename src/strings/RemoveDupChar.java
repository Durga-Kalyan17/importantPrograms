package strings;

import java.util.LinkedHashSet;

public class RemoveDupChar {
	
	public static void removeDupChar(String s)
	{
		char [] ch = s.toCharArray();
		System.out.println("Given String : "+s);
		System.out.print("Result String : ");
		LinkedHashSet<Character> result = new LinkedHashSet<>();
		for(Character c : ch)
			result.add(c);
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		RemoveDupChar.removeDupChar("javajava");

	}

}
