package com.string;

import java.util.ArrayList;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		performance();
	}
	public boolean comapreString(String s1, String s2) {
		if (s1.equalsIgnoreCase(s2))
			return true;
		else
			return false;
	}

	public String concatString(String s1, String s2) {
		return s1.concat(s2);
	}

	public int[] addOneToArray(int[] numbers) {
		int length = numbers.length;
		int[] output = new int[length];

		for (int i = 0; i < length; i++) {
			output[i] = numbers[i] + 1;

		}
		return output;
	}
	
	public static void performance()
	{
	//	List list = new ArrayList<>();
		TreeSet<Object> t = new TreeSet<>();
		
		
		System.out.println(t);
		
		for(int i =0;i<10000;i++)
		{
			t.add(i);
			System.out.println(i);
		}
		
	}
	public int aException(int number)
	{
		return number/0;
	}

}
