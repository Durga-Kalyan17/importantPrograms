package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

	public Employee(String name, int salary, String city) {
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	String name;
	int salary;
	String city;

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Durga", 20000, "Hyderabad"));
		list.add(new Employee("Anil", 40000, "Hyderabad"));
		list.add(new Employee("Mahendra", 30000, "Banglore"));
		
		int totalSalary  = 0;
		System.out.println(list);
		
		List<Integer> salaries = (List<Integer>) list.stream().map(c -> c.getSalary()).collect(Collectors.toList());
		for(Integer i : salaries) {
			totalSalary = totalSalary + i;
		}
		System.out.println(totalSalary);
		
		List<String> cities = list.stream().map(c -> c.getCity()).distinct().collect(Collectors.toList());
	
		System.out.println(cities);
		
	}

}
