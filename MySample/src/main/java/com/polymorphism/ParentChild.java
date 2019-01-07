package com.polymorphism;

public class ParentChild {
	
	   public static void main(String[] args) {
	        Parent p = (Parent) new Child();
	        p.show();
	        p.OnlyParentShow();
	        
	        //compile time error ,p is not access child specific method
	//        p.OnlyChildShow();   
	        System.out.println(p.x);
	        System.out.println(p.getClass());
	        
	        
	        System.out.println("********************");
	        Child c =  new Child();
	        c.show();
	        c.OnlyParentShow();
	        c.OnlyChildShow();
	        System.out.println(p.x);
	        System.out.println(c.getClass());
	        
	        Child ca = (Child) new Parent();
	        ca.OnlyChildShow();

	    }

}
