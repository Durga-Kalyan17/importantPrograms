package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test9 {

	public static void main(String[] args) {
		int n = 573;
		   int count = 0;
		   int unit;
		   for(int i = n; i > 0; i = i/10){
		       
		       unit = i % 10;
		       count++;
		      System.out.println(i);
		   }
		   System.out.println(count);
		   List<Integer> list = new ArrayList<>();
		   list.add(8);
		   list.add(9);
		   list.add(2);
		   list.add(5);
		   System.out.println(list);
		   list.stream().sorted();
		   Collections.sort(list);
		   System.out.println(list);
	}

}
