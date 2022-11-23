package org.howard.edu.lsp.assignment7;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class is an implementation of the AverageStrategy Interface
 * @author azandriahudson
 *
 */
public class DroppedAverage implements AverageStrategy {
/**
 * This method sorts the list and removes the two lowest values
 * A conditional statement checks if the list is empty and throws an Exception if true
 * The for loop iterates through the list and adds each integer to the sum
 * The sum is divided by the amount of elements and stored in total
 * @return sends total average back to the GradeCalculator
 */
	@Override
	public int compute(ArrayList<Integer> grades) throws EmptyListException{
		if (grades.size() == 0) {
			throw new EmptyListException("Average can't be calculated from empty list");
		}
		Collections.sort(grades);
		grades.remove(0);
		grades.remove(0);
		int sum = 0;
		for(int grade:grades) {
			sum += grade;
	}
		int total = sum/grades.size();
		return total;
		
		
		
		
	}

}
