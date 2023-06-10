package test;

import java.util.Arrays;

public class Test8 {

	public static void main(String[] args) {
		
		int [] a = {1, 2 , 3, 4, 5};
		int [] b = {6, 7, 8, 9};
		int count = 0;
		
		int [] c = new int[(a.length + b.length)];
		
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		
		for(int j = a.length; j < c.length; j++) {
			c[j] = b[count];
			count++;
		}
		
		System.out.println(Arrays.toString(c));
	}

}
