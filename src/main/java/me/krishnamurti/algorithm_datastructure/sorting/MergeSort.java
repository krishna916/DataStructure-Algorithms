/**
 * 
 */
package me.krishnamurti.algorithm_datastructure.sorting;

/**
 * @author krishna
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		mergeSort(intArray, 0, intArray.length);

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	public static void mergeSort(int[] input, int start, int end) {

		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;

		mergeSort(input, start, mid); // left part of array

		mergeSort(input, mid, end); // right part of the array

		merge(input, start, mid, end);
		
		//mergeDesc(input, start, mid, end); // descending sort
	}

	public static void merge(int[] input, int start, int mid, int end) {

		if (input[mid - 1] <= input[mid]) {
			return;
		}

		int i = start;
		int j = mid;
		int tempIndex = 0;

		int[] temp = new int[end - start];

		while (i < mid && j < end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		// System.out.println("start + tempIndex: " + start + " " + tempIndex);
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);

	}

	public static void mergeDesc(int[] input, int start, int mid, int end) {

		if (input[mid - 1] >= input[mid]) {
			return;
		}

		int i = start;
		int j = mid;
		int tempIndex = 0;

		int[] temp = new int[end - start];

		while (i < mid && j < end) {
			temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
		}
		// System.out.println("start + tempIndex: " + start + " " + tempIndex);
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);

	}

}
