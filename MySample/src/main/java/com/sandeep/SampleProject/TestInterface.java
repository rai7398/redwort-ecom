package com.sandeep.SampleProject;

import java.lang.reflect.Method;

public class TestInterface implements Interface1,Interface2{
	public static void main(String[] args)
	{
		TestInterface t = new TestInterface();
		t.m2();
		t.m1();
		t.m();
		//Interface1.super.m1();
//		Class s = t.getClass();
//		Method[] method = s.getMethods();
//		int i=0;
//		for(Method m:method)
//		{
//			System.out.println(i+" "+m.getName());
//			i++;
//		}
	//	Interface1.m1();
		
	}
	public void  m1()
	{
//		Interface1.super.m1();
//		Interface2.super.m1(); 

		Interface1.super.m1();
		Interface2.super.m1(); 
	}
	public void  m2()
	{
//		Interface1.super.m1();
//		Interface2.super.m1(); 

		Interface1.m2();
		Interface2.m2(); 
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		Interface1.super.m1();
	}


}
