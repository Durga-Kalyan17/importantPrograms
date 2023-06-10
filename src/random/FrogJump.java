package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrogJump {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of Stones : ");
		int n = scan.nextInt();
		int cost = 0;
		System.out.println("Enter Stone Heights : ");
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i < n;i++)
			list.add(scan.nextInt());
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1 ; j < n; j++) {
				for(int k = i+2; k < n; k++) {
					
					if(list.get(i) < list.get(j) && list.get(i) < list.get(k)) {
						if((list.get(j) - list.get(i)) > (list.get(k) - list.get(i))) {
							System.out.print(list.get(j)+ "-" + list.get(i) + " = " );
							System.out.println(list.get(j) - list.get(i));
							System.out.print(list.get(k)+ "-" + list.get(i) + " = " );
							System.out.println(list.get(k) - list.get(i));
							System.out.println("cost = "+ cost + " + "+(list.get(k) - list.get(i)));
							cost += (list.get(k) - list.get(i));
							System.out.println("cost - "+cost);
							System.out.println(i);
							i = k;
							System.out.println(i);
							System.out.println("----------------------------------------");
						}
						else if((list.get(j) - list.get(i)) < (list.get(k) - list.get(i))){
							System.out.print(list.get(j)+ "-" + list.get(i) + " = " );
							System.out.println(list.get(j) - list.get(i));
							System.out.print(list.get(k)+ "-" + list.get(i) + " = " );
							System.out.println(list.get(k) - list.get(i));
							System.out.println("cost = "+ cost + " + "+(list.get(j) - list.get(i)));
							cost += (list.get(j) - list.get(i));
							System.out.println("cost - "+cost);
							System.out.println(i);
							i = j;
							System.out.println(i);
							System.out.println("----------------------------------------");
						}
						else {
							continue;
						}
					}
					else {
						if((list.get(i) - list.get(j)) > (list.get(i) - list.get(k))) {
							System.out.print(list.get(i)+ "-" + list.get(j) + " = " );
							System.out.println(list.get(i) - list.get(j));
							System.out.print(list.get(i)+ "-" + list.get(k) + " = " );
							System.out.println(list.get(i) - list.get(k));
							System.out.println("cost = "+ cost + " + "+(list.get(i) - list.get(k)));
							cost += (list.get(i) - list.get(k));
							System.out.println("cost - "+cost);
							System.out.println(i);
							i = k;
							System.out.println(i);
							System.out.println("----------------------------------------");
						}
						else if((list.get(i) - list.get(j)) < (list.get(i) - list.get(k))){
							System.out.print(list.get(i)+ "-" + list.get(j) + " = " );
							System.out.println(list.get(i) - list.get(j));
							System.out.print(list.get(i)+ "-" + list.get(k) + " = " );
							System.out.println(list.get(i) - list.get(k));
							System.out.println("cost = "+ cost + " + "+(list.get(i) - list.get(j)));
							cost += (list.get(i) - list.get(j));
							System.out.println("cost - "+cost);
							System.out.println(i);
							i = j;
							System.out.println(i);
							System.out.println("----------------------------------------");
						}
						else {
							continue;
						}
					}
				}
			}
		}
		
		System.out.println(cost);
		
	}

}
