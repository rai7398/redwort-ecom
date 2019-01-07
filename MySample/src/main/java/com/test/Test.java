package com.test;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public  class Test {
	   public static void main(String[] args) throws 
	      InstantiationException, IllegalAccessException, 
	      IllegalArgumentException, InvocationTargetException{ 
	      
	      A a = A.INSTANCE;
	      A b = A.INSTANCE;
	       
	      System.out.println(a.hashCode());
	      System.out.println(b.hashCode());
	   }
	}
	enum A implements Serializable {
	   INSTANCE ;
	   public static void doSomething()
	   {
		   
	   }
	}
	