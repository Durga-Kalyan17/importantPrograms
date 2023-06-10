package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test10 {

	public static void main(String[] args) {

		//Collections - ArrayList.
		List<Integer> list = new LinkedList<>();

		for (int i = 0; i < 15; i++) {
			list.add(i);
		}
		System.out.println("List size will increase automatically if we add elememnts.");
		System.out.println("Lists are 2 type : 1) ArrayList   2) LinkedList");
		System.out.println("List ");
		System.out.println("Collections - LinkedList : " + list);
		System.out.println("size() : " + list.size());
		System.out.println("isEmpty() : " + list.isEmpty());
		System.out.println("contains() 9 : " + list.contains(9));
		System.out.println("contains() 20 : " + list.contains(20));
		System.out.println("clear() :");
		list.clear();
		System.out.println("Collections - LinkedList : " + list);
		System.out.println("size() : " + list.size());
		System.out.println("isEmpty() : " + list.isEmpty());
		

		
		// Array
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}

		System.out.println();
		System.out.println();
		System.out.println("Array size will not increase  automatically if we add elememnts ");
		System.out.println("Array : " + Arrays.toString(arr));

		/*
		 * list.add(0); list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
		 * list.add(6); list.add(7); list.add(8); list.add(9);
		 */

		// Collections.sort(list);
		/*
		 * List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		 * System.out.println(sorted);
		 */

	}

}
