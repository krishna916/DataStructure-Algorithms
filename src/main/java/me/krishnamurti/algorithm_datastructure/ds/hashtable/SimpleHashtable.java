package me.krishnamurti.algorithm_datastructure.ds.hashtable;

import me.krishnamurti.algorithm_datastructure.utility.Employee;

public class SimpleHashtable {
	
	
	public StoredEmployee[] hashtable;
	
	public SimpleHashtable() {
		hashtable = new StoredEmployee[10];
	}
	
	
	public void put(String key, Employee employee) {
		int hashedKey = hashkey(key);
		
		if(occupied(hashedKey)) {
			int stopIndex = hashedKey;
			if(hashedKey == hashtable.length -1) {
				hashedKey = 0;
			} else {
				hashedKey++;
			}
			
			while(occupied(hashedKey) && hashedKey != stopIndex) {
				hashedKey = (hashedKey + 1) % hashtable.length;
			}
		} 
		
		if(occupied(hashedKey)) {
			System.out.println("That is position is already taken");
		} else {
			hashtable[hashedKey] = new StoredEmployee(key, employee);
		}
	}
	
	public Employee get(String key) {
		int hashedKey = findKey(key);
		if(hashedKey == -1) {
			return null;
		}
		return hashtable[hashedKey].employee;
	}
	
	
	public void printHashTable() {
		for(int i = 0; i < hashtable.length; i++) {
			if(hashtable[i] == null) {
				System.out.println("empty");
			} else {
				System.out.println("Position : " + i + ", value: " + hashtable[i].employee);
			}
		}
	}
	
	private int findKey(String key) {
		int hashedKey = hashkey(key);
		if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
			return hashedKey;
		}
		
		
		int stopIndex = hashedKey;
		if (hashedKey == hashtable.length - 1) {
			hashedKey = 0;
		} else {
			hashedKey++;
		}

		while (hashedKey != stopIndex && hashtable[hashedKey] != null &&  !hashtable[hashedKey].key.equals(key)) {
			hashedKey = (hashedKey + 1) % hashtable.length;
		}
		
		if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
			return hashedKey;
		} else {
			return -1;
		}
		 
	}
	
	public Employee remove(String key) {
		int hashedKey = findKey(key);
		if(hashedKey == -1) {
			return null;
		}
		
		Employee employee = hashtable[hashedKey].employee;
		hashtable[hashedKey] = null;
		StoredEmployee[] oldHashtable = hashtable;
		
		// rehashing and adding to new hashtable..
		hashtable = new StoredEmployee[oldHashtable.length];
		for(int i = 0; i < oldHashtable.length; i++) {
			if(oldHashtable[i] != null) {
				put(oldHashtable[i].key, oldHashtable[i].employee);
			}
		}
		
		return employee;
	}
	
	
	private int hashkey(String key) {
		return key.length() % hashtable.length; 
	}
	
	private boolean occupied(int index) {
		return hashtable[index] != null;
	}
	
	
}
