package numbers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SeparateUniqueAndDuplicateNumbers {
	
	public static void separateNumbers(List<Integer> numbers)
	{
		//numbers.stream().
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n Value :");
		int n = Integer.parseInt(scan.nextLine().trim());
		
		System.out.println("Enter List of Values :");
		List<Integer> numbers = new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			numbers.add(Integer.parseInt(scan.nextLine().trim()));
		}
	}

}
