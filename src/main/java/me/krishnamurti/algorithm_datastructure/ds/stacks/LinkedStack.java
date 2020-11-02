package me.krishnamurti.algorithm_datastructure.ds.stacks;

import java.util.LinkedList;
import java.util.ListIterator;

import me.krishnamurti.algorithm_datastructure.utility.Employee;

public class LinkedStack {
	
	private LinkedList<Employee> stack;
	
	public LinkedStack() {
		stack = new LinkedList<>();
	}
	
	
	
	public void push(Employee employee) {
		stack.push(employee);
	}
	
	public Employee pop() {
		return stack.pop();
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int size() {
		return stack.size();
	}
	
	public void printStack() {
		ListIterator<Employee> iterator = stack.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
