package numbers;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	@Override
	public String toString() {
		return "name=" + name +", " 
				+ "city=" + city + ", "
						+ "salary=" + salary + "\n" ;
	}

	String name;
	String city;
	int salary;
	
	public Test(String name,String city,int salary)
	{
		this.name=name;
		this.city=city;
		this.salary=salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public static void main(String[] args ) {
		
		List<Test> empList = new LinkedList<>();
		
		empList.add(new Test("abd","banglore",200000));
		empList.add(new Test("vk","banglore",100000));
		empList.add(new Test("dk","hyderabad",20000));
		
		System.out.println("Player List : ");
		System.out.println(empList);
		System.out.println();
		
		// Total Salary of all Employees using 'StremAPI - map()' Method
		List<Integer> salaryList = empList.stream().map(s -> s.getSalary())
				.collect(Collectors.toList());
		
		int totalSalary = 0;
		for(Integer i : salaryList)
			totalSalary += i;
		System.out.println("total salary : "+totalSalary);
		System.out.println();
		
		// Select Distinct(non duplicate values) cities using 
							// 'StreamAPI - distinct()' method
		List<String> distinctCityList = empList.stream().map(c -> c.getCity())
				.collect(Collectors.toList());
		System.out.println("Distinct Cities : ");
		distinctCityList.stream().distinct().forEach(c -> System.out.println(c));
		
	}

}
