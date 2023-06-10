package test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		check(a);
	}

	private static void check(int a) {
		String result = (a > 85)?"First Class":((a >= 70 && a<= 85)?"Second Class"
				:((a > 35 && a < 70)?"Third Class":(a == 35)?"pass":"Fail"));
		System.out.println(result);
	}

}
