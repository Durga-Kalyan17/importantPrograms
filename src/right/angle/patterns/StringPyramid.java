package right.angle.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringPyramid {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String :");
		String input = scan.nextLine();
		int in = 0;

		pyramid(input, in);
	}

	private static void pyramid(String input, int in) {
		List<Character> chList = new ArrayList<>();

		for (int i = 65; i < 91; i++)
			chList.add((char) i);

		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < chList.size(); j++) {
				if (chList.get(j) == input.charAt(i))
					in = i;
			}
		}

		String first = input.substring(0, in).toUpperCase();
		String last = input.substring(in).toUpperCase();
		
		in = 1;
		if (first.length() > last.length()) {
			for (int i = 0; i < last.length(); i++) {
				System.out.print(first.substring(0, in) + "" + last.substring(0, in));
				in++;
				System.out.println();
			}
			for (int j = 0; j < (first.length() - last.length()); j++) {
				System.out.print(first.substring(0, in) + "" + last);
				in++;
				System.out.println();
			}
		}

		else if (first.length() < last.length()) {
			for (int i = 0; i < first.length(); i++) {
				System.out.print(first.substring(0, in) + "" + last.substring(0, in));
				in++;
				System.out.println();
			}
			for (int j = 0; j < (last.length() - first.length()); j++) {
				System.out.print(first + "" + last.substring(0, in));
				in++;
				System.out.println();
			}
		}
		
		else {
			for (int i = 0; i < first.length(); i++) {
				System.out.print(first.substring(0, in) + "" + last.substring(0, in));
				in++;
				System.out.println();
			}
		}

	}

}
