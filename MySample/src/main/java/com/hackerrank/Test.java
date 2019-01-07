package com.hackerrank;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
	
		boolean a = false;
		if(a=true)
			System.out.println("hi");
		else
			System.out.println("bye");
		
		String s = "A";
		String s1 = new String("A");
		String s2 = s1.intern();
		System.out.println(s1==s2);
		System.out.println(s1==s);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	//	System.out.println(findQualifiedNumbers(a));
	}

//	static String findQualifiedNumbers(int[] numberArray) {
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//char[] c = "abc".toCharArray();
//		for (int a : numberArray) {
//
//			int checker = 0;
//			int b = a;
//
//			while (b > 0) {
//
//				int c = b % 10;
//
//				if (c == 1 && checker < 4) {
//					checker++;
//				}
//				if (c == 2 && checker < 4) {
//					checker++;
//				}
//				if (c == 3 && checker < 4) {
//					checker++;
//				}
//
//				b = b / 10;
//			}
//			if (checker > 2) {
//				ts.add(a);
//			}
//
//		}
//		if (ts.size() == 0)
//			return "-1";
//		else {
//			String result = "";
//			int i = 1;
//			for (int digit : ts) {
//				if (i < ts.size()) {
//					result = result + digit + ",";
//				} else {
//					result = result + digit + "";
//				}
//				i++;
//			}
//			return result;
//		}
//
//	}

}
