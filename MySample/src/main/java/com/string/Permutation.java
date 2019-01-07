package com.string;

//Java program to print all permutations of a
//given string.
public class Permutation
{
 public static void main(String[] args)
 {
//     String str = "ABC";
//     int length = str.length();
//     Permutation permutation = new Permutation();
//     permutation.permute(str, 0, length-1);
	 String s1 = "abc";
	 String s2 = "abc";
	 System.out.println("s1 == s2 is:" + s1 == s2);
	 
	 String str = null;
	 String str1="abc";
	 System.out.println(str1.equals("abc") | str1.equals(str));
	 
	 int x = 10*10-10;
		
		System.out.println(x);
		method(null);
		}
		public static void method(Object o) {
			System.out.println("Object impl");
		}
		public static void method(String s) {
			System.out.println("String impl");
		}
 /**
  * permutation function
  * @param str string to calculate permutation for
  * @param l starting index
  * @param r end index
  */
 private void permute(String str, int firstIndex, int endIndex)
 {
     if (firstIndex == endIndex)
         System.out.println(str);
     else
     {
         for (int i = firstIndex; i <= endIndex; i++)
         {
             str = swap(str,firstIndex,i);
             permute(str, firstIndex+1, endIndex);
             str = swap(str,firstIndex,i);
         }
     }
 }

 /**
  * Swap Characters at position
  * @param a string value
  * @param i position 1
  * @param j position 2
  * @return swapped string
  */
 public String swap(String a, int i, int j)
 {
     char temp;
     char[] charArray = a.toCharArray();
     temp = charArray[i] ;
     charArray[i] = charArray[j];
     charArray[j] = temp;
     return String.valueOf(charArray);
 }

}

//This code is contributed by Mihir Joshi