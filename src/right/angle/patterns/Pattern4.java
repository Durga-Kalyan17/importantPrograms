package right.angle.patterns;

public class Pattern4 {
	
	public static void pattern4(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		
		Pattern4.pattern4(5);

	}

}
