/**
 * 
 */
package me.krishnamurti.algorithm_datastructure.ds;

import java.util.ArrayList;
import java.util.List;

import me.krishnamurti.algorithm_datastructure.utility.Employee;

/**
 * @author krishna
 *
 */
public class ArrayLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Jane", "Jones", 123));
		employeeList.add(new Employee("John", "Doe", 1232));
		employeeList.add(new Employee("Mary", "Smith", 55));
		employeeList.add(new Employee("Jane", "Sooja", 4543));
		
		
		employeeList.forEach(employee -> System.out.println(employee));
		
		System.out.println(employeeList.get(1));
	}

}
