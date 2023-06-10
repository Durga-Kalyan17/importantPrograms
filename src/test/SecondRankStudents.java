package test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author DurgaKalyan
 * 
 */
public class SecondRankStudents {
	
	/**
	 * @param name, marks
	 * 
	 */
	private static void secondRankStudents(String[] name, float[] marks) {
		List<String> list = new LinkedList<>();
		int count1 = 0, count2 = 0;
		for(int i=0;i<marks.length;i++) {
			count1 = 0;
			count2 = 0;
			for(int j=0;j<marks.length;j++) {
				if(marks[i] == marks[j])
					count2++;
				if(marks[i] < marks[j])
					count1++;
			}
			if(count1 == marks.length-count2-1) 
				list.add(name[i]);
		}
		list.stream().sorted().forEach(c -> System.out.println(c));
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int N = scan.nextInt();
		
		String [] name = new String[N];
		float [] marks = new float[N];
		
		System.out.println("Enter Students Names: ");
		for(int i=0;i<N;i++) 
			name[i] = scan.nextLine();
		
		System.out.println("Enter Students Marks: ");
		for(int j=0;j<N;j++)
			marks[j] = scan.nextFloat();
		
		secondRankStudents(name, marks);
	}
}
