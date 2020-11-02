package me.krishnamurti.algorithm_datastructure.ds.stacks;

import me.krishnamurti.algorithm_datastructure.utility.Employee;

public class LinkedMain {
	
	
	public static void main(String[] args) {
		
		Employee  jane = new Employee("Jane", "Jones", 123);
		Employee  john = new Employee("John", "Doe", 1232);
		Employee  mary = new Employee("Mary", "Smith", 55);
		Employee  jany = new Employee("Jany", "Sooja", 4543);
		Employee  billEnd = new Employee("Bill", "End", 4543);
		
		LinkedStack stack = new LinkedStack();
		stack.push(jane);
		stack.push(john);
		stack.push(mary);
		stack.push(jany);
		stack.push(billEnd);
		
		stack.printStack(); 
		
	}
}
 