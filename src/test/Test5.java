package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = scan.nextInt();
		int [] arr = new int[n];
		int count = 0;
		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		/*
		 * for(int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			count = 0;
			for(int j = i; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("arr[i] - "+arr[i]+" "+"arr[j]"+arr[j]);
					count++;
					//System.out.println("count - "+count);
				}
			}
			//System.out.println("count - "+count);
			if(count > 0) {
				list.add(count);
			}
		}
		
		System.out.println(list);
		list.stream().sorted();
		System.out.println(list);
		
		System.out.println(list.get(list.size() - 1));
		
	}

}
