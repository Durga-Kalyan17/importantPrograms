package patterns;

import java.util.Scanner;

public class Test {
	
	public static void alphabet(int n)
	{
		if(n%3 == 0)
		{
			int i=1;
			while(i <= n)
			{
				for(int j=1;j<=n;j++)
				{
					if(i < n/3+1 && j > n/3 && j < 2*n/3+1)
						System.out.print(" ");
					else if(i > 2*n/3 && j > n/3 && j < 2*n/3+1)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				System.out.println();
				i++;
			}
		}
		else
		{
			System.out.println("Invaid Input.");
			System.out.println("Enter a Multiple of 3.");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a Multiple of 3 :");
		int n = sc.nextInt();
		Test.alphabet(n);

	}

}
