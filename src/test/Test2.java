package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = scan.nextInt();
		int digiCount = 0, m = n;
		int result = digitCount(n, m, digiCount);
		System.out.println(result);
	}

	private static int digitCount(int n, int m, int digiCount) {
		if(m == 0) {
			m = n;
			System.out.println("m : "+m);	
			return digiCount;
		}
		digiCount++;
		m /= 10;
		System.out.println("m : "+m);	
		return digitCount(n, m, digiCount);
		
	}

}
