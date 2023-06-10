package patterns;

public class StarPattern {
	
	public static void starPattern(int n)
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
		
		StarPattern.starPattern(5);

	}

}
