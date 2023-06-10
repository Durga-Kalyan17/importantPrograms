package recursion.numbers;

import java.util.Scanner;

public class EvenNumbersRecursion {
	
	private static void evenNumbers(long m, long n) {
		if(m == n+1) 
			return;
		if(m % 2 == 0)
			System.out.println(m);
		
		evenNumbers(++m, n);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start Number : ");
		long m = scan.nextLong();
		System.out.println("Enter end Number : ");
		long n = scan.nextLong();
		System.out.println("Even Numbers : ");
		evenNumbers(m, n);

	}
}
