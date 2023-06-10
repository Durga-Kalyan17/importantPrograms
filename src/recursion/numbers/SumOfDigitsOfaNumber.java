package recursion.numbers;

import java.util.Scanner;

/**
 * @author DurgaKalyan
 * 
 */
public class SumOfDigitsOfaNumber {
	
	/**
	 * @param n, sum
	 * 
	 */
	public static void sumOfDigits(long n, long sum) {
		if(n == 0) {
			System.out.println("Sum of Digits of given Number : \n"+sum);
			return;
		}
			sum += n%10;
			n /= 10;
			sumOfDigits(n, sum);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to sum it's Digits : ");
		long n = scan.nextLong();
		long sum = 0;
		sumOfDigits(n, sum);
	}
}
