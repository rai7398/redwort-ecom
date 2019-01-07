package com.test;

import java.lang.reflect.Constructor;

public class TestReflectionSinglton {
	 public static void main(String[] args) 
	    { 
	        Singlton instance1 = Singlton.instance; 
	        Singlton instance2 = null; 
	        try
	        { 
	            Constructor[] constructors =  
	            		Singlton.class.getDeclaredConstructors(); 
	            for (Constructor constructor : constructors)  
	            { 
	                // Below code will destroy the singleton pattern 
	                constructor.setAccessible(true); 
	                instance2 = (Singlton) constructor.newInstance(); 
	                break; 
	            } 
	        } 
	      
	        catch (Exception e)  
	        { 
	            e.printStackTrace(); 
	        } 
	          
	    System.out.println("instance1.hashCode():- " 
	                                      + instance1.hashCode()); 
	    System.out.println("instance2.hashCode():- " 
	                                      + instance2.hashCode()); 
	    } 
	

}
