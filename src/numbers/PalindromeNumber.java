package numbers;

public class PalindromeNumber {
	
	public static void palindromeNumber(int a)
	{
		int p = 0, t = a;
		while(t != 0)
		{
			p = p*10;
			System.out.println("p*10 : "+p);
			p = p+(t%10);
			System.out.println("t%10 : "+t%10);
			System.out.println("p : "+p);
			t = t/10;
			System.out.println("t = t/10 - " + t);
		}
		if(a == p)
		{
			System.out.println("output : "+p);
			System.out.println(a+" is a Palindrome Number");
		}
		else
		{
			System.out.println("output : "+p);
			System.out.println(a+" is Not a Palindrome Number");
		}
	}

	public static void main(String[] args) {
		
		palindromeNumber(121);
	}

}
