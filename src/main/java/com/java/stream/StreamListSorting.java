package com.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamListSorting {
	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>(); 
		frutas.add("Banana");
		frutas.add("Apple");
		frutas.add("Mango");
		frutas.add("Orange");
		
		List<String> sortedFrutas = frutas.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedFrutas);
		
		List<String> sortedFrutas2 = frutas.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sortedFrutas2);
		
		List<String> sortedFrutas3 = frutas.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedFrutas3);
		
		//descending order
		System.out.println("\n");
		List<String> sortedReverseFrutas = frutas.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedReverseFrutas);
		
		List<String> sortedReverseFrutas2 = frutas.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortedReverseFrutas2);
		
		
		//sort employee by salary in ascending order
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10,"Ustari",30,4000));
		employees.add(new Employee(20,"Kevin",30,3000));
		employees.add(new Employee(30,"Chavez",30,5000));
		employees.add(new Employee(40,"Ramesh",30,2000));
		employees.add(new Employee(50,"Ramesh",30,1000));
		
		List<Employee> sortedEmployee = employees.stream().sorted().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}
			
		}).collect(Collectors.toList());
		
		System.out.println(sortedEmployee);
		
		//es lo  mismo que el ejercicio de arriba pero con lambda
		List<Employee> sortedEmployee2 = employees.stream()
				.sorted((Employee o1, Employee o2) -> o1.getSalary() - o2.getSalary())
				.collect(Collectors.toList());
		System.out.println(sortedEmployee2);
		
		List<Employee> sortedEmployee3 = employees.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(sortedEmployee3);
		
		List<Employee> sortedReversedEmployee3 = employees.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(sortedReversedEmployee3);
		
		
	}

}
