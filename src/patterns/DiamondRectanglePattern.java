package patterns;

import java.util.Scanner;

public class DiamondRectanglePattern {

	public static void rectangleDiamond(int m, int n)
	{
		if(m%2 == 1 && n%2 == 1)
		{
			int count = m-1;
			for(int i=0;i<m;i++)
			{
				
				count = m-1;
				for(int j=0;j<n;j++)
				{
					if(i < m/2 && (j < n/2-i || j > n/2+i))
						System.out.print(" ");
					else if(i > m/2 && (j < i-n/2 || j > count))
					{
						System.out.print(" ");
						count--;
					}
					else if(i == m/2 || j == n/2)
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
		
		System.out.println("Enter any 2  Numbers : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		DiamondRectanglePattern.rectangleDiamond(m, n);

	}

}
