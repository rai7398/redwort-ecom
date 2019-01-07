package com.datastructure.array;

import java.util.PrimitiveIterator.OfInt;

public class ArraySample {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
	//	printArray(reverseArray(array));
		System.out.println();
		String str = " this is my house";
		System.out.println(reverseString(str));
		rvereseArray(array,0,array.length-1);
	}

	private static String reverseString(String str) {
		char[] array = str.toCharArray();
		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			char temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;

		}

		return new String( array);

		
	}

	// method to reverse the array
	static int[] reverseArray(int array[]) {
		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;

		}

		return array;

	}
	 static void rvereseArray(int arr[], int start, int end) 
	    { 
	        int temp; 
	        if (start >= end) 
	            return; 
	        temp = arr[start]; 
	        arr[start] = arr[end]; 
	        arr[end] = temp; 
	        rvereseArray(arr, start+1, end-1); 
	    } 
	
	//print array
	public static void printArray(int[] array)
	{
	
		for(int a: array)
		{
			System.out.print(a);
		}
	}
	public static void printStringArray(String[] array)
	{
	
		for(String a: array)
		{
			System.out.print(a);
		}
	}

}
