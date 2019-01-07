package com.collection;

import java.util.HashMap;
import java.util.TreeMap;

public class MyMap {
	public static void main(String[] args) {
	// TreeMap< Student,String> map = new TreeMap<>(new MyComprator());
	//	map.put(null,null);
	//	System.out.println(map);

System.out.println();
		
		Student s1 = new Student(1, "sandeep");
		Student s2 = new Student(2, "anshu");
		Student s3 = new Student(3, "nitu");
		Student s4 = new Student(4, "kitu");
		Student s5 = new Student(5, "pari");
		 StringBuilder input1 = new StringBuilder();
		 System.out.println(input1+" g ");
		
//		map.put( s1,s1.name);
//		map.put( s2,s2.name);
//		map.put( s3,s3.name);
//		map.put( s4,s4.name);
//		map.put(s5,s5.name);
		
		
		HashMap hm = new HashMap<>();
		Integer i1= new Integer(10);
		Integer i2= new Integer(10);
		
		

		hm.put(i1, "sandeep");
		hm.put(i2, "kanak");
		
		System.out.println(hm);


	}

}
