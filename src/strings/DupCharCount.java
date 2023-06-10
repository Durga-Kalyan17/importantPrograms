package strings;

public class DupCharCount {
	
	public static void dupCharCount(String s)
	{
		int [] count = new int[123];
		for(int i=0;i<s.length();i++)
		{
			count[(int) s.charAt(i)] = count[(int) s.charAt(i)] +1;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>1)
				System.out.println((char)i+" - "+count[i]);
		}
	}

	public static void main(String[] args) {
		
		DupCharCount.dupCharCount("javalli");
		

	}

}
