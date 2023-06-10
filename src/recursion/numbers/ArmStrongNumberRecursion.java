package recursion.numbers;

import java.util.Scanner;

/**
 * @author DurgaKalyan
 * 
 */
public class ArmStrongNumberRecursion {

	/**
	 * Main method
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		long n = scan.nextLong();
		long ref = n, m = n, arm = 0;
		byte r = 0;
		int pow = 1;
		//int count = 0, digiCount = 0;
		
		String result = armStrongNumber(n, m, r, arm, ref, pow);
		System.out.println(result);
	}

	/**
	 * Method to calculate power of each digit
	 * @param pow, ref, n, r
	 * 
	 * 
	 */
	private static int power(int pow, long ref, long n, byte r) {
		if(ref == 0) {
			ref = n;
			return pow;
		}
		pow *= r;
		ref /= 10;
		return power(pow, ref, n, r);
	}
	
	/**
	 * Method to check and print given number is ArmStrong Number or not.
	 * @param n, m, r, arm, ref, pow
	 * 
	 */
	private static String armStrongNumber(long n, long m, byte r, long arm, long ref, int pow) {
		if(m == 0) {
			if(arm == n) 
				return n+" is an ArmStrong Number";
			else 
				return n+" is not an ArmStrong Number";
		}
		else if(m != 0) {
			r = (byte) (m % 10);
			arm += power(pow, ref, n, r);
			m /= 10;
		}
		
		return armStrongNumber(n, m, r, arm, ref, pow);
		
	}
	
	/**
	 * Method to calculate count of no of digits in the given INPUT.
	 * Using this method  to avoid execution of else block in
	 * 		 armStrongNumber(n, m, r, arm, ref, pow, count, digiCount) method during each 
	 * 		 each Recursive Call. Because we need to execute 'if or else' block in last Recursive call only
	 * @param n, m, digiCount
	 * 
	 *
	 *
	 * private static int digitCount(long n, long m, int digiCount) { 
	 *  if(m == 0) { 
	 * 		m = n; 
	 * 		return digiCount;
	 *  } 
	 *  digiCount++;
	 *  m /= 10; 
	 *  return digitCount(n, m,digiCount);
	 * }
	 *  
	 */
	

}
