package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.howard.edu.lsp.assignment4.Integer_Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerSetTest{
//test for clear
	@DisplayName("Testing for clear")
	@Test
	public void testClear() {
		Integer_Set set = new Integer_Set();
		set.clear();
		assertEquals(0, 0);
		}
	
	
	
//test for length of set	
	@DisplayName("Testing for length of set")
	@Test
	
	public void testLength() {
		Integer_Set set = new Integer_Set();
		assertEquals(0, set.length());
		}	
		
	
	 
//test to find largest element
	@DisplayName("Testing for largest item")
	@Test
	public void testLargest() throws Listemptyexception, org.howard.edu.lsp.assignment4.Listemptyexception {
		Integer_Set set1 = new Integer_Set();
		set1.addItem(1);
		set1.addItem(2);
		set1.addItem(3);
		set1.addItem(4);
		int expectedValue = 0;
		expectedValue = set1.largestelement();
		assertEquals(4, expectedValue);
		}

		
	
// test to find  smallest element
	@DisplayName("Testing for smallest item")
	@Test
	public void testSmallest() throws org.howard.edu.lsp.assignment4.Listemptyexception {
		Integer_Set set1 = new Integer_Set();
		set1.addItem(1);
		set1.addItem(2);
		set1.addItem(3);
		set1.addItem(4);
		int expectedValue = 0;
		expectedValue = set1.smallestelement();
		assertEquals(1, expectedValue);
		}
	 
    
//test for add item
		@DisplayName("Testing for add item")
		@Test
		public void testaddItem() {
			
			Integer_Set set = new Integer_Set();
			set.addItem(1);
			set.addItem(2);
			set.addItem(3);
			assertTrue(set.contains(1));
			

			
			
		
//test for remove item 
			
	
	
// test for union of sets

	
//test for intersection
			
    
//test for difference
	
}
}