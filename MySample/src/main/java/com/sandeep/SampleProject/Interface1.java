package com.sandeep.SampleProject;

public interface Interface1 {
	public void m();
	default void m1()
	{
		System.out.println("interface 1 m1");
		
	}
	static void m2()
	{
		System.out.println("interface 1 m2");
		
	}

}
