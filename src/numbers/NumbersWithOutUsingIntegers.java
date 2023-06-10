package numbers;

public class NumbersWithOutUsingIntegers {
	
	static char a = 'd';
	static char chArr [] = {'a','b','c','d','e','f','g','h','i','j','k'};
	static int j = chArr[10]-chArr[0];
	
	public static void numbersWithOutUsingIntegers (char a,char [] chArr)
	{
		for(int i=a-chArr[2];i<=(j*j*j)+(j*j)+j+(chArr[1]-chArr[0]);i++)
		{
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		NumbersWithOutUsingIntegers.numbersWithOutUsingIntegers (a,chArr);
		

	}

}
