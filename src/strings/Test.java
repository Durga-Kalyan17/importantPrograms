package strings;

public class Test {
	
	public static void test(String str)
	{
		char [] ch = new char[123];
		for(int i=0;i<str.length();i++)
		{
			ch[str.charAt(i)] += 1;
		}
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>0)
				System.out.println((char)i);
		}
	}
	
	public static void main(String[] args) {
		
		Test.test("java");

	}

}
