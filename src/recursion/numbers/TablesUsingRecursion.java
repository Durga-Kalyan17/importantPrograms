
package recursion.numbers;

import java.util.Scanner;

/**
 * @aurhor DurgKalyan
 * 
 */
public class TablesUsingRecursion {
	
	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		long n = scan.nextLong();
		
		System.out.println("Enter last multiple : ");
		long m = scan.nextLong();
		long multiple = 1;
		
		System.out.println(n+" th Table : ");
		nThTable(n, m, multiple);

	}

	/**
	 * @param n, m, multilple
	 * 
	 */
	private static void nThTable(long n, long m, long multiple) {
		if(multiple == m+1)
			return;
		
		System.out.println(n+"*"+multiple+" = "+n*multiple);
		multiple++;
		nThTable(n, m, multiple);
		
	}

}
