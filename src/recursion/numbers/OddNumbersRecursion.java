package recursion.numbers;

import java.util.Scanner;

/**
 * @author DurgaKalyan
 * 
 */
public class OddNumbersRecursion {
	
	/**
	 * @param m, n
	 * 
	 */
	private static void oddNumbers(long m, long n) {
		if(m == n+1) 
			return;
		if(m % 2 == 1)
			System.out.println(m);
	
		oddNumbers(++m, n);
	}
	
	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start Number : ");
		long m = scan.nextLong();
		System.out.println("Enter end Number : ");
		long n = scan.nextLong();

		System.out.println("Odd Numbers : ");
		oddNumbers(m, n);
	}
}
