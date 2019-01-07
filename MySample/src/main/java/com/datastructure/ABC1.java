package com.datastructure;

//public class ABC1 extends Thread{
//	public static void main(String[] args) {
//        Thread t1 = new Thread("T1");
//        Thread t2 = new Thread("T2");
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            System.out.println("Main Thread interrupted.");
//        }
//    }
//
//    public void run(){
//        System.out.println("Run executed");
//    }
//}
public class ABC1
{
	 public static void main(String args[]) { 
//	        String a1 = "Stop"; 
//	        StringBuffer ab = new StringBuffer(a1); 
//
//	        ab.reverse(); 
//	        a1.concat(ab.toString()); 
//
//	        System.out.println(a1 + ab + a1.length() + ab.length()); 
		 
		 //2
//		 byte a = 4;
//	        byte b = 6;
//	        System.out.print((b%a) + ", ");
//	        System.out.println(b == ( (b/a)*a + (b%a) ));
// 3
		 

		        int varM = 0;
		        addTwo(varM++);
		        System.out.println(varM);
		    }

static void addTwo(int varM) {
    varM += 3;
}

}