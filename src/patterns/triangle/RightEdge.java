package patterns.triangle;

import java.util.Scanner;

public class RightEdge {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scan.nextInt();
		
		rightEdgeTriangle(n);
	}

	private static void rightEdgeTriangle(int n) {
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			
			if(i <= n/2)
				count++;
			else
				count--;
			
			for(int j = 0; j < count; j++) {
		
				if(j >= n/2 && i > n/2) 
					continue;
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
