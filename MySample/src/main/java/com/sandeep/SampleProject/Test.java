package com.sandeep.SampleProject;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Test {
	 public static void main(String[] args)
			        throws CloneNotSupportedException
			    {
		 Person p1 = new Person();
		 Person p2 = new Person();
		 HashMap<Person, String> hm = new HashMap<Person,String>();
		 hm.put(p1, "sandeep");
		 hm.put(p2, "sandeep");
		 
		 
			        A a = new A(20, "GeeksForGeeks");
			 
			        // cloning 'a' and holding
			        // new cloned object reference in b
			 
			        // down-casting as clone() return type is Object
			       A b = (A)a.clone();
			 
//			        System.out.println(b.i);
//			        System.out.println(b.s);
			    }
	
		}
	

