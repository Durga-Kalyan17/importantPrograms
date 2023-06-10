
package numbers;


/**
 * @author Durgakalyan
 * 
 */
public class PrimeNumber {
	
	/**
	 * @param n
	 * 
	 */
	public static void primeNumbers(int n)
	{
		int count1=0;
		int count2=0;
		System.out.println("PRIME NUMBERS :");
		for(int i=1;i<=n;i++)
		{
			count1=0;
			for(int j=1;j<=n;j++)
			{
				if(i%j==0)
				{
					count1++;
					//System.out.println("count :"+count);
				}
			}
			if(count1 == 2)
			{
				System.out.println("prime number :"+i);
				count2++;
			}
		}
		System.out.println("total prime numbers upto "+n+" are "+count2);
	}
	
	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		PrimeNumber.primeNumbers(1000);	
		
	}
}
