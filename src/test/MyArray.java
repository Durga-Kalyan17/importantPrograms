package test;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {
		
		int value = 0;
		
		add(10);
		
	}

	private static void add(int value) {
		int len = 0;
		len++;
		int [] a = new int[len];
		a[0] = value;
		System.out.println(Arrays.toString(a));
	}

}
