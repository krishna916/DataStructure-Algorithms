/**
 * 
 */
package me.krishnamurti.algorithm_datastructure.ds.linkedlist;

import me.krishnamurti.algorithm_datastructure.utility.Employee;

/**
 * @author krishna
 *
 */
public class SinglyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee  jane = new Employee("Jane", "Jones", 123);
		Employee  john = new Employee("John", "Doe", 1232);
		Employee  mary = new Employee("Mary", "Smith", 55);
		Employee  jany = new Employee("Jany", "Sooja", 4543);
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addToFront(jane);
		list.addToFront(john);
		list.addToFront(mary );
		list.addToFront(jany);
		
		list.printList();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		list.removeFromFront();
		System.out.println(list.size());
		list.printList();
	}

}
