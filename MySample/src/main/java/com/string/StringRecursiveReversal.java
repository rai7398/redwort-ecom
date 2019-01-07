package com.string;

public class StringRecursiveReversal {
	public static void main(String[] args) {
		recursiveMethod("sandeep");
	}
	

static String recursiveMethod(String str)
{
	 if ((null == str) || (str.length() <= 1))
	 {
	        return str;
	 }

	 return recursiveMethod(str.substring(1)) + str.charAt(0);
}}