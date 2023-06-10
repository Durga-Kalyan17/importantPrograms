package recursion.arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author DurgaKalyan
 * 
 */
public class FindElement {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the list : ");
		int n = scan.nextInt();
		System.out.println("Enter Target Value : ");
		int x = scan.nextInt();
		int idx = 0;
		System.out.println("Enter list of values : ");
		List<Integer> list = new LinkedList<>();
		for(int i = 0;i < n;i++) {
			list.add(scan.nextInt());
		}
		
		findElement(list, x, idx);
	}

	/**
	 * This Method checks the target element 'x' present in the list or not.
	 * @param list
	 * @param x
	 * @param idx
	 * 
	 */
	private static void findElement(List<Integer> list, int x, int idx) {
		if(idx == list.size()) {
			System.out.println("Target element not found");
			return;
		}
		if(list.get(idx) == x) {
			System.out.println("Target found at index - "+(idx));
			return;
		}
		
		findElement(list, x, ++idx);
	}
	
}
