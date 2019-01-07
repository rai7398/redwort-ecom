package com.sandeep.SampleProject;

class A 
{
    int i;
    String s;
 
    // A class constructor
    public A(int i,String s)
    {
        this.i = i;
        this.s = s;
    }
 
    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone()
    throws CloneNotSupportedException
    {
        return super.clone();
    }
}