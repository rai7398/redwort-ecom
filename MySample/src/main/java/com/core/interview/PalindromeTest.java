package com.core.interview;

public class PalindromeTest {
	public static void main(String[] args) {
		String[] inputString= {"abcba","abba","abcda"};
		for(int i=0;i< inputString.length;i++)
		{
		System.out.println("Input String : "+inputString[i]);
		System.out.println("Using recursion");
        System.out.println( isPalindromeUsingRecursion(inputString[i]) ? inputString[i]+ " is a palindrome." :  inputString[i]+ "is not a palindrome."); 
       
        System.out.println();
        System.out.println("Without recursion");
        System.out.println(isPalidrome(inputString[0]) ? inputString[i]+ " is a palindrome." :  inputString[i]+ "is not a palindrome."); 
        System.out.println("*****************************************");
        System.out.println();

		}
	}

	private static boolean isPalidrome(String str) {
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		int i = 0;
		while (i < length / 2) {
			if (charArray[i] != charArray[length - 1 - i]) {
				return false;
			}
			i++;

		}

		return true;
	}
	
	
	// using recursion
	 public static boolean isPalindromeUsingRecursion(String str){
         if(str.length()==0 || str.length()==1){
                return true;
         }
         if(str.charAt(0)==str.charAt(str.length()-1)){
                return isPalindromeUsingRecursion(str.substring(1,str.length()-1));
         }
  
  return false;
  }
}
/*
Input String : abcba
Using recursion
abcba is a palindrome.

Without recursion
abcba is a palindrome.
*****************************************

Input String : abba
Using recursion
abba is a palindrome.

Without recursion
abba is a palindrome.
*****************************************

Input String : abcda
Using recursion
abcdais not a palindrome.

Without recursion
abcda is a palindrome.
*****************************************



*/

