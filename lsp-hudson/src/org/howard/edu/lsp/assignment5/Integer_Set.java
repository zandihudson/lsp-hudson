package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* @author Azandria Hudson
 * 
 */

public class Integer_Set {
	
	   private ArrayList<Integer> set = new ArrayList<>();
	  

/*
* This method clears the internal representation of the set
*/
		  public void clear() {
		        set.clear();
		    }
/*
 * This method returns the length of the set
 */
		   public int length() {
		        return set.size();
		    }

		    public boolean equals(Integer_Set b) {
		        
		         ArrayList<Integer> set2=b.set;
		         
		         if(set.size()!=set2.size()) {
		             return false;
		         }
		         
		         ArrayList<Integer> x=set;
		         
		         ArrayList<Integer> y=set2;
		         
		         Collections.sort(x);
		         Collections.sort(y);
		         
		         for(int i=0;i<x.size();i++) {
		             if(x.get(i)!=y.get(i)) {
		                 return false;
		             }
		         }
		         
		         return true;
		        
		    }
/*
 * This method loops through the set and returns the largest element
 */
		    
		    public int largestelement() throws Listemptyexception {
		        
		        if(set.size()==0) {
		            Listemptyexception empty= new Listemptyexception();
		            throw empty;
		        }
		        
		        int max=0;
		        
		        for(int i=0;i<set.size();i++) {
		            if(set.get(i)>max) {
		                max=set.get(i);
		            }
		        }
		        
		        return max;
		        
		    }
		    
/*
 * This method loops through set and returns smallest element
 */
		    
		    public int smallestelement() throws Listemptyexception {
		        
		        if(set.size()==0) {
		            Listemptyexception empty= new Listemptyexception();
		            throw empty;
		        }
		        
		        int min=Integer.MAX_VALUE;
		        
		        for(int i=0;i<set.size();i++) {
		            if(set.get(i)<min) {
		                min=set.get(i);
		            }
		        }
		        
		        return min;
		        
		    }
		    
/*
 * This method adds item if not already existing in list
 */
		    
		    public void addItem(int item ) {
		    	if (!set.contains(item)) { 
		               set.add(item); 
		          }                  
		     
		    }
/*
 * This method returns selected item in set	    
 */
		    public void removeItem(int item ) {
		        
		    	if (!set.contains(item)) { 
		               set.remove(item); 
		          }
		        
		        
		    }
		    
/*
 * This method returns the union of both sets. Which includes all elements of both sets in one set
 */
		    public Integer_Set union(Integer_Set set2) {
		        
		        ArrayList<Integer> temp=set2.getlist();
		        
		        Set<Integer> set = new HashSet<>();
		        set.addAll(set);
		        set.addAll(temp);
		        
		        ArrayList<Integer> set3= new ArrayList<>(set);
		        
		        Integer_Set set4= new Integer_Set();
		        
		        return set4;
		        
		    }
		    
/*
 * This method returns the intersection of two sets. Which is the shared elemnts between them
 */
		    public Integer_Set intersection(Integer_Set set2) {
		        
		        ArrayList<Integer> temp= set2.getlist();
		        
		        set.retainAll(temp);
		        
		      Integer_Set list4= new Integer_Set();
		        
		        return list4;
		    }
		    
/*
 * This method returns the difference of two sets
 */
		    public Integer_Set difference (Integer_Set set2) {
		        
		        ArrayList<Integer> temp=set2.getlist();
		        
		        // Remove all elements in list2 from list
		        set.removeAll(temp);
		        
		      Integer_Set set4= new Integer_Set();
		        
		        return set4;
		        
		    }
		    
		    public ArrayList<Integer> getlist(){
		        return set;
		    }
			
		    
		       
	    }
		