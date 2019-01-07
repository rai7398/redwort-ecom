package com.multithreading;

public class MyDeadlock {
	
String s1 = "java";
String s2 ="test";
Thread trd1 = new Thread("My Thread 1"){
    public void run(){
        while(true){
            synchronized(s1){
                synchronized(s2){
                    System.out.println(s1 + s2);
                }
            }
        }
    }
};
 
Thread trd2 = new Thread("My Thread 2"){
    public void run(){
        while(true){
            synchronized(s2){
                synchronized(s1){
                    System.out.println(s2 + s1);
                }
            }
        }
    }
};
 
public static void main(String a[]){
    MyDeadlock mdl = new MyDeadlock();
    mdl.trd1.start();
    mdl.trd2.start();
}
}
