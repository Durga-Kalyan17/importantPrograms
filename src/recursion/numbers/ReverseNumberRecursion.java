package recursion.numbers;

import java.util.Scanner;

/**
 * @author DurgaKalyan
 * 
 */
public class ReverseNumberRecursion {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		long n = scan.nextLong();
		
		System.out.println("Reverse Number : ");
		reverseNumber(n);
	}

	/**
	 * @param n
	 * 
	 */
	private static void reverseNumber(long n) {
		if(n == 0)
			return;
		
		byte ref;
		long result = 0;
		ref = (byte) (n%10);
		result = (result*10) + ref;
		n /= 10;
		System.out.print(result);
		
		reverseNumber(n);
		
	}
}
