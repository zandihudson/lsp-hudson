package org.howard.edu.lsp.assignment4;

import java.util.*;

public class Driver {

	public static void main(String[] args)  {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2= new ArrayList<>();
		Integer_Set set1 = new Integer_Set(list1);
		Integer_Set set2= new Integer_Set(list2);
		
		  set1.addItem(1);
		  set1.addItem(2);
		  set1.addItem(3);
		
		  
		  set2.addItem(4);
		  set2.addItem(5);
		  set2.addItem(6);
		  set2.addItem(7);
		  
		  System.out.println("Set 1 contains: "+set1.getlist());
		  System.out.println("Set 2 contains: "+set2.getlist());
		  
		  set1.clear();
		  System.out.println("After clearing, Set 1 contains: "+set1.getlist());
		  System.out.println("Set 1 length: "+set1.length());
		  System.out.println("Set 2 length: "+set2.length());
		  
		  System.out.println("Are the sets equal : "+set1.equals(set2));
		  set1.addItem(4);
		  System.out.println("After adding element to Set 1: "+set1.getlist());
		  set2.removeItem(5);
		  System.out.println("After removing element from Set 2: "+set2.getlist());
		  
		  try {
			System.out.println("Largest element in Set 1 : "+set1.largestelement());
		} catch (Listemptyexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
		  try {
			System.out.println("Smallest element in Set 2 : "+set2.smallestelement());
		} catch (Listemptyexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		    
		  Integer_Set setUnion= set1.union(set2);
		    
		  System.out.println("Unoin : "+setUnion.getlist() );
		    
		  Integer_Set setIntersection= set1.intersection(set2);
		    
		  System.out.println("Intersection : "+setIntersection.getlist() );
		  
		  Integer_Set setDifference= set1.difference(set2);
		    
		  System.out.println("Difference: "+setDifference.getlist() );
		  
	}

}	