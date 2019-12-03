/**
 * 
 */
package me.krishnamurti.algorithm_datastructure.ds.linkedlist.doublyLinkedList;

import me.krishnamurti.algorithm_datastructure.utility.Employee;

/**
 * @author krishna
 *
 */
public class EmployeeNode {

	private Employee employee;
	private EmployeeNode next;
	private EmployeeNode previous;

	/**
	 * @param employee
	 */
	public EmployeeNode(Employee employee) {
		super();
		this.employee = employee;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @return the next
	 */
	public EmployeeNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	/**
	 * @return the previous
	 */
	public EmployeeNode getPrevious() {
		return previous;
	}

	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}

	public String toString() {
		return employee.toString();
	}

}
