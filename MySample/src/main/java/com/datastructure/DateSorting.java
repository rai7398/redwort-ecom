package com.datastructure;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Collections;



public class DateSorting {

	public static void main(String[] args) throws ParseException {
	
		String[] date ={"20/07/2015","22/07/2015","10/07/2015","02/07/2015","17/07/2015"};
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		 
		ArrayList<Date> al = new ArrayList<Date>();
		for(int i =0; i<date.length;i++)
		{
			al.add(sdf.parse(date[i]));
		}
		 Collections.sort(al);
			 
	            
	         
	        for(int i = 0; i < al.size(); i++){
	            System.out.println(al.get(i).toString());
	        }
	 
	}

}
