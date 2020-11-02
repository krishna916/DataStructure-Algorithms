package me.krishnamurti.algorithm_datastructure.ds.stacks;

import me.krishnamurti.algorithm_datastructure.utility.Employee;

public class stackMain {
	
	
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(3);
		
		stack.push(new Employee("Jane", "Jones", 123));
		stack.push(new Employee("John", "Doe", 2342));
		stack.push(new Employee("Mary", "Smith", 312));
		stack.push(new Employee("Mike", "Tyson", 324244));
		stack.push(new Employee("Bill", "End", 34));
		
		//stack.printStack(); 
		
		System.out.println(stack.peek());
	
		//stack.printStack();
		
		System.out.println("popped: " + stack.pop());
		
		stack.printStack();
		
	}
}
