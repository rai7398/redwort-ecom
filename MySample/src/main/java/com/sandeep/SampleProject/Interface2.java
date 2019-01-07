package com.sandeep.SampleProject;

public interface Interface2 {
	int a=10;
	default void m1()
	{
		System.out.println("interface 2 m1"+a);
		
	}
	static void m2()
	{
		System.out.println("interface 2 m2");
		
	}
}
