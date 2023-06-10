package right.angle.patterns;

public class Pattern2 {
	
	public static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String [] args)
	{
		Pattern2.pattern2(5);
	}
}
