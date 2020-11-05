package me.krishnamurti.algorithm_datastructure.ds.hashtable;

import me.krishnamurti.algorithm_datastructure.utility.Employee;

public class SimpleHashTableMain {
	
	public static void main(String[] args) {
		Employee  jane = new Employee("Jane", "Jones", 123);
		Employee  john = new Employee("John", "Doe", 1232);
		Employee  mary = new Employee("Mary", "Smith", 55);
		Employee  jany = new Employee("Jany", "Sooja", 4543);
		Employee  billEnd = new Employee("Bill", "End", 345);
		
		SimpleHashtable ht =new SimpleHashtable();
		ht.put("jane", jane);
		ht.put("john", john);
		ht.put("marrys", mary);
		ht.put("jany", jany);
		ht.put("billy", billEnd);
		
		System.out.println("billy: " + ht.get("billy"));
		
		
		ht.printHashTable();
		
		
		ht.remove("jany");
		
		
		ht.printHashTable();
	}
}
