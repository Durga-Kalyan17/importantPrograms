package patterns;

import java.util.Scanner;

public class DiamondSquarePattern {
	
	public static void squareDiamond(int n)
	{
		if(n >= 3 && n % 2 == 1)
		{
			int count = n-1;
			for(int i=0;i<n;i++)
			{
				count = n-1;
				for(int j=0;j<n;j++)
				{
					if(i < n/2 && (j < n/2-i || j > n/2+i))
						System.out.print(" ");
					else if(i > n/2 && (j < i-n/2 || j > count))
					{
						System.out.print(" ");
						count--;
					}
					else if(i == n/2 || j == n/2)
						System.out.print("*");
					else
						System.out.print("*");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Enter an ODD Number = 3 or More.");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an ODD Number : ");
		int n = sc.nextInt();
		
		DiamondSquarePattern.squareDiamond(n);

	}

}
