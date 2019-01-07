package com.oops;

public class Child extends Parent implements IStudent {

	@Override
	public String getName() {

		return "Sandeep";
	}

	public String get() {
		return "child";
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		Parent p1 = new Child();
		Child c = new Child();
		
		System.out.println(p.get());
		System.out.println(p1.get());
		System.out.println(c.get());
//		System.out.println(p.getName());    // compiletime
//		System.out.println(p1.getName());  // compiletime error
		System.out.println(c.getName());
		

	}

}
