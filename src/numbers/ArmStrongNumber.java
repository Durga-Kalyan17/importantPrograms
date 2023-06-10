package numbers;

import java.util.Scanner;

/**
 * Written By
 * @author DurgaKalyan
 * 
 */
public class ArmStrongNumber {
	
	/**
	 * Main method
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = scan.nextInt();
		
		String result = ArmStrongNumber.armStrongNumber(n);
		System.out.println(result);
	}

	/**
	 * Method to check and print given number is ArmStrong Number or not.
	 * @param n
	 * 
	 */
	public static String armStrongNumber(int n)
	{
		int t, b, r, a = 1, arm = 0, pow = 0;
		
	   /**
		* While loop to calculate power of each digit
		* 
		*/
		t = n;
		while(t !=0)
		{
			pow++;
			t = t/10;
		}
		t = n;
		while(t != 0)
		{
			r = t%10;
			b = pow;
			while(b != 0)
			{
				a *= r;
				b--;
			}
			arm += a;
			a = 1;
			t = t/10;
		}
		if(arm == n)
			return n+" "+"is an Arm Strong number";
		else
			return n+" "+"is not an Arm Strong number";
	}
	
}
