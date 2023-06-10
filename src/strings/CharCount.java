package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharCount {

	public static void charCount(String s) {
		System.out.println();
		int[] count = new int[123];
		for (int i = 0; i < s.length(); i++)
			count[(int) s.charAt(i)] = count[(int) s.charAt(i)] + 1;

		for (int i = 0; i < count.length; i++)
			if (count[i] > 0)
				System.out.println((char) i + " - " + count[i]);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = scan.nextLine();

		// CharCount.charCount(s);
		charecterCount(s);
//		LinkedHashMap<Character, Integer> outputMap = charecterCount(s);
//		 outputMap.entrySet().stream()
//		 .forEach(entry -> System.out.println(entry.getKey() + " - " +
//		 entry.getValue()));
	}

	private static void charecterCount(String s) {

		int count = 0, left = 0, right = 0;
		char key = '0';

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {

			if (right == s.length() - 1) {
				if (s.charAt(left) == s.charAt(right))
					count++;

				key = s.charAt(left);
				if (!map.containsKey(key))
					map.put(s.charAt(left), count);
				// System.out.println(s.charAt(left) + " - " + count);
				left++;
				i = left;
				right = left;
				count = 0;
			}
			if (s.charAt(left) == s.charAt(right))
				count++;
			if (left == s.length() - 1) {
				key = s.charAt(left);
				if (!map.containsKey(key))
					map.put(s.charAt(left), 1);
			}

			right++;
		}
		map.entrySet()
		   .stream()
		   .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

		//return map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}

}
