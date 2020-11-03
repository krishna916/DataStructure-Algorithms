package me.krishnamurti.algorithm_datastructure.ds.queue;

import me.krishnamurti.algorithm_datastructure.utility.Employee;

public class ArrayQueueMain {
	
	public static void main(String[] args) {
		
		Employee  jane = new Employee("Jane", "Jones", 123);
		Employee  john = new Employee("John", "Doe", 1232);
		Employee  mary = new Employee("Mary", "Smith", 55);
		Employee  jany = new Employee("Jany", "Sooja", 4543);
		Employee  billEnd = new Employee("Bill", "End", 345);
		
		ArrayQueue queue = new ArrayQueue(10);
		queue.add(jane);
		queue.add(john);
		queue.add(mary);
		queue.add(jany);
		queue.add(billEnd);
		
		queue.remove();
		
		queue.remove();
		
		
		queue.printQueue();
		
		
		System.out.println();
		System.out.println(queue.peek());
		
		System.out.println();
		
		queue.printQueue();
	}
}
