package test;

import java.util.LinkedList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		float [] a = {2.1f,2.1f,1f,4f,5f,9f};
		String [] n = {"vk","abd","dk","mw","fa","rp"};
		int count1 = 0, count2 = 0;
		for(int i=0;i<a.length;i++) {
			count1 = 0;
			count2 = 0;
			for(int j=0;j<a.length;j++) {
				if(a[i] == a[j])
					count2++;
				if(a[i] < a[j])
					count1++;
			}
			if(count1 == a.length-count2-1)
			{
				System.out.println("index is - "+i+"  value is - "+n[i]);
				list.add(n[i]);
			}
		}
		
		list.stream().sorted().forEach(c -> System.out.println(c));
	}
}