package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamApiExample1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sandeep");
		list.add("Anshu");
		list.add("Nikesh");
		list.add("Juhi");
		list.add("Priyanka");
		
		System.out.println(list.add("sandeep"));
		
		String[] s = {"anshu","Anshu","babita","Komal","sandy","nandy"};
		
		ArrayList al = (ArrayList) list.stream().sorted().collect(Collectors.toList());
		ArrayList arr = (ArrayList) Arrays.asList(s).stream().sorted().collect(Collectors.toList());
		ArrayList arrDes = (ArrayList) Arrays.asList(s).stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
		

		System.out.println(al);
		System.out.println(arr);
		System.out.println(arrDes) ;
	}
}
