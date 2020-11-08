package me.krishnamurti.algorithm_datastructure.searching;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };
	
		//System.out.println(iterativeBinarySearch(intArray, -15));
		
		System.out.println(recursiveBinarySearch(intArray, 55));
	}
	
	public static int iterativeBinarySearch(int[] input, int value) {
		int start = 0;
		int end = input.length;
		
		while(start < end) {
			int midpoint = (start + end) / 2;
			System.out.println("midpoint: " + midpoint);
			if(input[midpoint] == value) {
				return midpoint;
			} else if(input[midpoint] < value) {
				start = midpoint + 1;
			} else if(input[midpoint] > value) {
				end = midpoint;
			}
		} 
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] input, int value) {
		return recursiveBinarySearch(input, 0, input.length, value);
	} 

	private static int recursiveBinarySearch(int[] input, int start, int end, int value) {
		if(start >= end) {
			return -1;
		}
		
		int midpoint = (start + end) / 2;
		System.out.println("midpoint: " + midpoint);
		
		if(input[midpoint] == value) {
			return midpoint;
		} else if(input[midpoint] < value) {
			start = midpoint + 1;
			return recursiveBinarySearch(input, start, end, value);
		} else if(input[midpoint] > value) {
			end = midpoint;
			return recursiveBinarySearch(input, start, end, value);
		}
		return -1;
		
	}
	
}
