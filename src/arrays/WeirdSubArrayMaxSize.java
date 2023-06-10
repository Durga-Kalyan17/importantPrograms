package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class WeirdSubArrayMaxSize {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array :");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = scan.nextInt();
		
		weirdSubArrayMaxSize(arr, n);
	}

	private static void weirdSubArrayMaxSize(int[] arr, int n) {
		System.out.println("\nweird :");
		
		Set<List<Integer>> arrList = new HashSet<>();
		
		for(int i = 0; i < arr.length; i++) {
			List<Integer> list = new ArrayList<>();
			for(int j = 0; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					list.add(arr[j]);
					if(list.size() == 1 && arr[i] != arr[j])
						break;
				}
				 
			}
			if(list.size() >= 2)
				arrList.add(list);
		}
		
		System.out.println(arrList);
	}
	

}
