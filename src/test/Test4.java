package test;

import java.util.Arrays;
import java.util.List;

public class Test4 {
	
	

	public static void main(String[] args) {
		
		/*
		 * int i = 20; String str = i % 2 == 0 ? "Even" : "Odd";
		 * 
		 * System.out.println(str);
		 */
		
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5);
		
		list.stream().sorted();
		System.out.println(list);

	}

}
