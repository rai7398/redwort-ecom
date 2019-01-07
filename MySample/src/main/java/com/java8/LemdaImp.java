package com.java8;

public class LemdaImp implements Sayable{

	public static void main(String[] args) {  
	      
        // Lambda expression with single parameter.  
        Sayable s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sonoo"));  
          
        // You can omit function parentheses    
        Sayable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sonoo"));  
        int a =5;
        int[] array = {2,3,4,5};
       
        long l = a;
    }

	@Override
	public String say(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
interface Sayable{  
    public String say(String name);  
}  
  

