package right.angle.patterns;

public class Pattern3 {
	
	public static void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=(n-i))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Pattern3.pattern3(5);

	}

}
