package com.core.interview;

public class FactorialTest {

	public static void main(String[] args) {

		System.out.println("Using recursion");
		System.out.println(findFactorialUsingRecursion(5));

		System.out.println("Without recursion");
		System.out.println(findFactorial(5));

	}

	private static int findFactorialUsingRecursion(int num) {
		 if(num==0)
             return 1;
      return num* findFactorialUsingRecursion(num-1);
	}

	private static int findFactorial(int num) {
		int result=1;
		while(num>0)
		{
			result = result*num;
			num--;
		}
		return result;
	}
}

/*
input =5
Using recursion
120
Without recursion
120
*/
