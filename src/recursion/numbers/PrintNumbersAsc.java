package recursion.numbers;

import java.util.Scanner;

public class PrintNumbersAsc {
	
	private static void numbersInAscendingOrder(long m, long n) {
		if(m <= n) {
			if(m == n+1)
				return;
			System.out.println(m);
			m++;
			numbersInAscendingOrder(m, n);
		}
		else
			System.out.println("start Number should be < end Number");
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start Number : ");
		long m = scan.nextLong();
		System.out.println("Enter end Number : ");
		long n = scan.nextLong();
		System.out.println("Numbers in Ascending Order : ");
		numbersInAscendingOrder(m, n);
	}
}
