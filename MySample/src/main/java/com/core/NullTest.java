package com.core;

public class NullTest {
	int i;
	public static void main(String[] args) {

	
		
		// int a1 = (Integer) null;
		Integer a2 = (Integer) null;
		int[] b = null;

		String s = null;
		String s1 = new String();
		
		System.out.println(s1==null);
		System.out.println(s==null);
	//	System.out.println(null.equals(null));
		// null is only applicable on object type but not on literal type. it
		// will give compile time error which incompitable type
		//char c = null;
		// System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(b);
//		System.out.println(s);
//		System.out.println((String) null);
//
//		int a3 = (Integer) null;
//		String a4 = "HK";
		NullTest nt = new NullTest();
		nt.printName("sandeep");

	}
	public void printName(String s)
	{
		System.out.println(s+" "+i);
	}

}
