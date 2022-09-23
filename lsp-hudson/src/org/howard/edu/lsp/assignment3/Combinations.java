package org.howard.edu.lsp.assignment3;

import java.util.ArrayList;
import java.util.Arrays;

/*Azandria Hudson
*
* @author zandihudson
* 
*/

public class Combinations {
	public static void compute(ArrayList<Integer> input, int target, ArrayList<Integer> partial) {
		int sum = 0;
		for(int x: partial) sum += x;
		if (sum == target)
			System.out.println(partial);
		if (sum >= target)
			return;
		for (int i=0;i<input.size();i++) {
			ArrayList<Integer> remaining = new ArrayList<Integer>();
			int n = input.get(i);
			for (int k=i+1; k<input.size();k++) remaining.add(input.get(k));
			ArrayList<Integer> new_list = new ArrayList<Integer>(partial);
			new_list.add(n);
			compute(remaining,target,new_list);
		
			 
		}
	}
	public static void driver(ArrayList<Integer> input, int target) {
	        compute(input,target,new ArrayList<Integer>());
	}
	public static void main(String args[]) {
		
        Integer[] testcase1 = {5, 5, 15, 10};
        int target1 = 15;
        System.out.println("Case 1:");
        driver(new ArrayList<Integer>(Arrays.asList(testcase1)),target1);
        
        
        Integer[] testcase2 = {1, 2, 3, 4, 5, 6};
        int target2 = 6;
        System.out.println("Case 2:");
        driver(new ArrayList<Integer>(Arrays.asList(testcase2)),target2);
        
        Integer[] testcase3 = {};
        int target3 = 15;
        System.out.println("Case 3:");
        driver(new ArrayList<Integer>(Arrays.asList(testcase3)),target3);
        
        Integer[] testcase4 = {1,2,3,4,5};
        int target4 = 16;
        System.out.println("Case 4:");
        driver(new ArrayList<Integer>(Arrays.asList(testcase4)),target4);
        
        
        
        
        
        
        
    }
}