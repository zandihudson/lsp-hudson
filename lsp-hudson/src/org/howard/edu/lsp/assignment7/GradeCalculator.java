package org.howard.edu.lsp.assignment7;

import java.util.ArrayList;
/**
 * This class acts as a context class
 * @author azandriahudson
 *
 */
public class GradeCalculator{
	private AverageStrategy strategy;
/**
 * This method takes in a strategy and sets it as the strategy variable to be referenced later on
 * @param strategy  one of the implementations from the AverageStrategy interface
 */
	public void setStrategy(AverageStrategy strategy) {
		this.strategy = strategy;
	}
/**
 * This method takes in a list of grades to calculate the average
 * @param grades the ArrayList of integers provided by the Client
 * @return sends the calculated average back to the Client
 * @throws EmptyListException 
 */
	public int averageGrades(ArrayList <Integer> grades) throws EmptyListException {
		int average= strategy.compute(grades);
		return average;
		
	}

	
	
}