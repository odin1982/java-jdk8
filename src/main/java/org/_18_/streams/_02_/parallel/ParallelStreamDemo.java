package org._18_.streams._02_.parallel;

import java.util.ArrayList;

public class ParallelStreamDemo {
	public static void main(String[] args) {
		long time1,time2;
		ArrayList<Employee> eList = new ArrayList<>();
		
		for(int i=0; i<=100;i++) {
			eList.add(new Employee("John",20000));
			eList.add(new Employee("Rohn",130000));
			eList.add(new Employee("Sohn",40000));
			eList.add(new Employee("Tohn",150000));
			eList.add(new Employee("Gohn",610000));
			eList.add(new Employee("Lohn",70000));
			eList.add(new Employee("Mohn",90000));
		}
		
		time1 = System.currentTimeMillis();
		System.out.println("Sequential Stream Count = " + eList.stream().filter(e -> e.getSalary() > 1000).count());
		
		time2 = System.currentTimeMillis();
		System.out.println("Sequential stream time taken = " + (time2 - time1) + "\n");
		
		
		
		// parallel processing
		time1 = System.currentTimeMillis();
		System.out.println("Parralel stream count = " + eList.parallelStream().filter(e -> e.getSalary()>1000).count());
		time2 = System.currentTimeMillis();
		System.out.println("Time taken by parallel processing= " + (time2 - time1) + "\n");
	}

}
