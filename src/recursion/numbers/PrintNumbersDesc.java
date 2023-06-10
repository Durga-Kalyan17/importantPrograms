package recursion.numbers;

import java.util.Scanner;

/**
 * @author DurgaKalyan
 * 
 */
public class PrintNumbersDesc {
	
	public static void numbersinDescendingOrder(long m, long n) {
		if(m >= n) {
			if(m == n-1) {
				return;
			}
			System.out.println(m);
			m--;
			numbersinDescendingOrder(m, n);
		}
		else
			System.out.println("start Number should be > end Number");
			
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start Number : ");
		long m = scan.nextLong();
		System.out.println("Enter end Number : ");
		long n = scan.nextLong();
		System.out.println("Numbers in Descending Order : ");
		numbersinDescendingOrder(m, n);
	}
}
