
package strings;

import java.util.Arrays;

public class ReverseString {
	
	public static void reverseString(String s)
	{
		System.out.println("Given String : "+s);
		char [] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		System.out.print("Reversed String : ");
		for(int i = s.length()-1; i >= 0; i--)
		{
			System.out.print(ch[i]);
		}	
	}

	public static void main(String[] args) {
		
		reverseString("java");

	}

}
