package recursion.numbers;

import java.util.Scanner;

/**
 * @author DurgaKalyan
 * 
 */
public class PrimeNumbersRecursion {
	
	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number : ");
		long fn = scan.nextLong();
		
		System.out.println("Enter Last number : ");
		long ln = scan.nextLong();
		long count = 0, factor = 1;
		
		System.out.println("Prime Numbers between \n"+fn+" and "+ln+" are : \n");
		primeNumbers(fn, ln, count, factor);

	}

	/**
	 * @param fn, ln, count, factor
	 * 
	 */
	private static void primeNumbers(long fn, long ln, long count, long factor) {
		if(fn == ln+1)
			return;
		if(fn % factor == 0)
			count++;
			
		factor++;
		if(factor - fn == 1) {
			if(count == 2) 
				System.out.println("Prime Number : "+fn);
			
			fn++;
			count = 0;
			factor = 1;
		}
		
		primeNumbers(fn, ln, count, factor);
		
	}

}
