package right.angle.patterns;

import java.util.Scanner;

public class AlphaNumericPattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n = scan.nextInt();
		
		if(n == 0)
			System.out.println("Enter a number greater than 0.");
		else if(n == 1) {
			pyramid(n);
			System.out.println("Enter a number greater than 1 to know exact functionality of the code.");
		}
		else
			pyramid(n);
		
	}

	private static void pyramid(int n) {
		
		System.out.println("Output :");
		int ch = 97;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				
				if(i % 2 == 0 && j % 2 != 0) 
					System.out.print((char) ch);
				else if(i % 2 != 0 && j % 2 == 0) 
					System.out.print((char) ch);
				else 
					System.out.print(i);	
			}
			ch++;
			System.out.println();
		}
		
	}

}
