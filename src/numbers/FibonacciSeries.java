package numbers;

public class FibonacciSeries {
	
	public static void fibonacciSeries(int a,int b,int n)
	{
		int c;
		System.out.print("fibonacci series :");
		for(int i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+"  ");
		}
	}

	public static void main(String[] args) {
		
		FibonacciSeries.fibonacciSeries(0,1,10);
		
	}

}
