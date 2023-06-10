package recursion.numbers;

import java.util.Scanner;

/**
 * @author DurgaKalyan
 * 
 */
public class FibonacciSeries {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		int a = 0, b= 1, count = 0, sum = 0;
		
		System.out.println("Fibonacci Series : ");
		fibonacciSeries(a, b, count, n, sum);
	}

	private static void fibonacciSeries(int a, int b, int count, int n, int sum) {
		if(count == n)
			return;
		sum = a + b;
		a = b;
		b = sum;
		System.out.println(sum);
		
		fibonacciSeries(a, b, ++count, n, sum);
	}

}
