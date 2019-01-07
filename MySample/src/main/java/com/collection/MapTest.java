package com.collection;

import java.util.ArrayList;
import java.util.HashMap;

import com.model.MyKey;

public class MapTest {
	public static <T> void main(String[] args) {
		HashMap<Student, Student> hm = new HashMap<>();
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(1, "sandeep");
		Student s2 = new Student(1, "sandeep");

		ArrayList<T> al1 = new ArrayList<T>();
		al1.add((T) s1);
		al1.add((T) s2);

		// al.add(s1);
		// al.add(s2);
		//
		s1 = null;
		s2 = null;
		System.out.println(al);
		
		String s3 = new String("anshu");
		String s4 = new String("kumar");
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add(s3);
		al2.add(s4);
		System.out.println(al2);
		s3= null;
		s4= null;
		System.out.println(al2);
		
		
//		for (Object o : al1) {
//			System.out.println(o);
//
//		}
//		MyKey mk = new MyKey("anshu");
//
//		HashMap myHashMap = new HashMap<>();
//		myHashMap.put(mk, "1");
//		System.out.println(mk.hashCode());
//		System.out.println(myHashMap);
//
//		mk.setS("rai");
//		System.out.println(mk.hashCode());
//		myHashMap.put(mk, "1");
//		System.out.println(myHashMap);
		

	}

}
