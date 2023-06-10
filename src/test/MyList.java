package test;

public class MyList {

	static int n;
	
	public static void main(String[] args) {
		
		System.out.print("[");
		add(1);
		add(2);
		System.out.print("]");

	}

	private static void add(int n) {
		int  count = 0;
		System.out.print(n);
		count++;
		if(count > 0)
			System.out.print(",");
		
	}

	

}
