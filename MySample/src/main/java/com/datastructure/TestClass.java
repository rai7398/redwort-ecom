package com.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class TestClass {
	  public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        int T = Integer.parseInt(br.readLine().trim());
	        for(int t_i=0; t_i<T; t_i++)
	        {
	            String s = br.readLine();

	            String out_ = decode(s);
	            System.out.println(out_);
	         }

	         wr.close();
	         br.close();
	    }
	    static String decode(String s){
	    	
	    	char[] ch = s.toCharArray();
	    	int l = s.length();
	    	int check =l;
HashMap<Integer,Character> hm = new HashMap<Integer,Character>();
//wrien
//erwin
for(int i =0;i<l/2+1;i++)
{

	int position = l/2 - i;   //2 ,2
	if((l-i)%2!=0)
	{
		hm.put(i, ch[position]);  //2,1
		check = l-i-2;	
	}
	else
	{
		hm.put(i, ch[position-1]);
		check = l-i-2;	
	}
	//check = l-i-2;		
}
//for(int i =(l/2)+1;i<l;i++)
//{
//
//	int position = check/2;   //2 ,2
//	if(check%2!=0)
//	{
//		hm.put(position, ch[i]);  //2,1
//		
//	}
//	else
//	{
//		hm.put(position-1, ch[i]);
//	}
//	check = l-i-1;		
//}
//			return hm.toString();
//	       
//	
return hm.toString();
    }
}
