package com.polymorphism;

public class Child extends Parent{
    int x=20;
    void show(){
        System.out.println("child-show");
    }
    void OnlyChildShow(){
        System.out.println("OnlyChildShow");
    }
}
