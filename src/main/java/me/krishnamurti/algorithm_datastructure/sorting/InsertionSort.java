/**
 * 
 */
package me.krishnamurti.algorithm_datastructure.sorting;

/**
 * @author krishna
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
		
		//recursiveInsertionSort(intArray, intArray.length);
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
			
			int newElement = intArray[firstUnsortedIndex];
			int i;
			
			for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				int test = intArray[i - 1];
				intArray[i] = intArray[i - 1];
			}
			
			intArray[i] = newElement;
		}		
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void recursiveInsertionSort(int[] input, int numItems) {
		
		if(numItems < 2) { // when there is only one item it is assumed to be sorted
			return;
		}
		
		recursiveInsertionSort(input, numItems - 1);
		
		int newElement = input[numItems - 1];
		int i;
		
		for(i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
			int test = input[i - 1];
			input[i] = input[i - 1];
		}
		
		input[i] = newElement;
		
	}

}
