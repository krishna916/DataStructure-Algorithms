/**
 * 
 */
package me.krishnamurti.algorithm_datastructure.ds.linkedlist.doublyLinkedList;

import me.krishnamurti.algorithm_datastructure.utility.Employee;

/**
 * @author krishna
 *
 */
public class DoublyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee  jane = new Employee("Jane", "Jones", 123);
		Employee  john = new Employee("John", "Doe", 1232);
		Employee  mary = new Employee("Mary", "Smith", 55);
		Employee  jany = new Employee("Jany", "Sooja", 4543);

		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

		list.addToFront(jane);
		list.addToFront(john);
		list.addToFront(mary);
		list.addToFront(jany);

		list.printList();
		System.out.println(list.size());

		Employee billEnd = new Employee("Bill", "End", 78);
		list.addToEnd(billEnd);

		list.printList();
		System.out.println(list.size());

		list.removeFromFront();
		list.printList();
		System.out.println(list.size());

		list.removeFromEnd();
		list.printList();
		System.out.println(list.size());
	}

}
