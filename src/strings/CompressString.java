package strings;

import java.util.Scanner;

public class CompressString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = scan.nextLine();

		int recursiveCall = 0;
		int count = 0;
		String compressed = "";

		compressString(str);
		String output = compressStringRecursion(str, recursiveCall, count, compressed);
		System.out.println(output);
	}

	private static String compressStringRecursion(String str, int recursiveCall, int count, String compressed) {

		if(recursiveCall == str.length())
			return "\nCompressed string using Recursion :\n" + compressed;

		count++;
		if (recursiveCall == str.length() - 1 || str.charAt(recursiveCall) != str.charAt(recursiveCall + 1)) {
			compressed = count == 1 ? compressed + str.charAt(recursiveCall) + Integer.toString(count)
							: compressed + str.charAt(recursiveCall) + Integer.toString(count);

			count = 0;
		}
		return compressStringRecursion(str, recursiveCall + 1, count, compressed);
	}

	private static void compressString(String str) {

		int count = 0;
		String compressed = "";

		for (int i = 0; i < str.length(); i++) {
			count++;
			if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
				compressed = count == 1 ? compressed + str.charAt(i) + Integer.toString(count)
								: compressed + str.charAt(i) + Integer.toString(count);

				count = 0;
			}
		}
		System.out.println("\nCompressed string :\n" + compressed);
	}

}
