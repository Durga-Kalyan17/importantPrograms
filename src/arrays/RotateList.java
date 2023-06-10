package arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

// Asked in Microsoft, Adobe, Amazon, Bloomberg
public class RotateList {

	public static void rotateList(int [] list, int moveBy)
	{
		System.out.println("Before Rotate : ");
		for(int i=0;i<list.length;i++)
			System.out.print(list[i]+" ");
		
		System.out.println();
		
		System.out.println("After Rotate : ");
		while((list.length-moveBy) != 0)
		{
			for(int i=0;i<list.length;i++)
			{
				for(int j=i+1;j<list.length;j++)
				{
					list[i] = list[i]+list[j];
					list[j] = list[i]-list[j];
					list[i] = list[i]-list[j];
					break;
				}
				if((list.length-moveBy)==1)
					System.out.print(list[i]+" ");
			}
			moveBy++;
		  }
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter listSize : ");
		int listSize = Integer.parseInt(scan.nextLine().trim());
		
		System.out.println("Enter moveBy no of Indexes value : ");
		int moveBy = Integer.parseInt(scan.nextLine().trim());
		
		System.out.println("Enter List of Values : ");
		int [] list = new int[listSize];
		for(int i=0;i<listSize;i++)
			list[i]=scan.nextInt();
		
		RotateList.rotateList(list, moveBy);
	}

}
