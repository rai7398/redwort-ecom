package com.test;

public class Singlton  
	{ 
	    // public instance initialized when loading the class 
	public enum Instance
	{
	}


	public static Singlton instance;
	    
	      
	    private Singlton()  
	    { 
	    	 final Singlton instance = new Singlton(); 
	    } 
	} 


