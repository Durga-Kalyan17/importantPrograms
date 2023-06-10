package right.angle.patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlphabeticPattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scan.nextInt();
		
		String pyramidPattern = alphabeticPyramid(n);
		
		System.out.println("\noutput :");
		System.out.println(pyramidPattern);

	}

	private static String alphabeticPyramid(int n) {
		
		List<Character> alphabetic = new ArrayList<>();
		
		for(int i = 90; i >= 65; i--)
			alphabetic.add((char) i);
		
		int count = 1;
		String pyramid = "";
		for(int i = n; i > 0 ; i--) {
			
			for(int j = i; j < i + count; j++) {
				
				if(count == 1 || j != (i + count) - 1)
					pyramid = pyramid + alphabetic.get(i - 1);
				else 
					pyramid = pyramid + alphabetic.get(i);
					
			}
			count++;
			pyramid = pyramid + "\n";
		}
		return pyramid;
		
	}

}
